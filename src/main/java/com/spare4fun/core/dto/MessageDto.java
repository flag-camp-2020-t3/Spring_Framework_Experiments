package com.spare4fun.core.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class MessageDto {
    @Getter
    @Setter
    private String message;
}
