package com.spare4fun.core.controller;

import com.spare4fun.core.dto.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AllUserAllowedController {
    @GetMapping("index")
    @ResponseBody
    public MessageDto index() {
        return MessageDto
                .builder()
                .message("index")
                .build();
    }
}
