package com.spare4fun.core.controller;

import com.spare4fun.core.dto.RegisterDto;
import com.spare4fun.core.dto.UserDto;
import com.spare4fun.core.entity.User;
import com.spare4fun.core.service.UserService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {
    private Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/user/register")
    @ResponseBody
    public RegisterDto register(@RequestBody RegisterDto registerDto) {
        logger.info("at register [POST]");
        UserDto userDto = registerDto.getUserDto();
        // User user = modelMapper.map(userDto, User.class);
        // userService.createUser(user);
        userDto.setPassword(null);
        return registerDto;
    }
}
