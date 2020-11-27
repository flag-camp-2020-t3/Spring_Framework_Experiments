package com.spare4fun.core.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class UserDto {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
}
