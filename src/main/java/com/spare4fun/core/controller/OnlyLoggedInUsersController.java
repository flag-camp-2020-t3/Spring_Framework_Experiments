package com.spare4fun.core.controller;

import com.spare4fun.core.dto.UserDto;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlyLoggedInUsersController {

    @GetMapping("/current")
    @ResponseBody
    public UserDto current() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        return UserDto
                .builder()
                .username(username)
                .build();
    }
}
