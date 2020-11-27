package com.spare4fun.core.controller;

import com.spare4fun.core.dto.UserDto;
import com.spare4fun.core.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class OnlyAdminController {

    @GetMapping("/current")
    @ResponseBody
    public UserDto current() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        return UserDto
                .builder()
                .username(username)
                .password(password)
                .build();
    }
}
