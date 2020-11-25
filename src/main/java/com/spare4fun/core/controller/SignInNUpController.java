package com.spare4fun.core.controller;

import com.spare4fun.core.dto.UserDto;
import com.spare4fun.core.entity.User;
import com.spare4fun.core.service.InMemoryUsers;
import com.spare4fun.core.service.UUIDAuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/users")
public class SignInNUpController {
    @Autowired
    private ModelMapper modelMapper;

    private Logger logger = LoggerFactory.getLogger(SignInNUpController.class);

    @Autowired
    private InMemoryUsers userService;

    @Autowired
    private UUIDAuthenticationService authentication;

    @PostMapping("/register")
    String register(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        userService
                .save(
                        User
                                .builder()
                                .id(username)
                                .username(username)
                                .password(password)
                                .build()
                );

        return login(username, password);
    }

    @PostMapping("/login")
    String login(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        return authentication
                .login(username, password)
                .orElseThrow(() -> new RuntimeException("invalid login and/or password"));
    }
}
