package com.spare4fun.core.controller;

import com.spare4fun.core.dto.MessageDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
