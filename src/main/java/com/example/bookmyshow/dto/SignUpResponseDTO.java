package com.example.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SignUpResponseDTO {
    private ResponseStatus responseStatus;
    private Long userId;
}