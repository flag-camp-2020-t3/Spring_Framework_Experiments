package com.spare4fun.core.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class UserDto {
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;
}
