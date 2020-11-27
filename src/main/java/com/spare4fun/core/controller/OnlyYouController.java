package com.spare4fun.core.controller;

import com.spare4fun.core.dto.UserDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/private/user")
public class OnlyYouController {
    @GetMapping("{username}")
    @ResponseBody
    @PreAuthorize("#username == authentication.principal.username")
    public UserDto privateUserInfo(@PathVariable String username) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String password = (String) authentication.getCredentials();
        return UserDto
                .builder()
                .username(username)
                .password(password)
                .build();
    }
}
