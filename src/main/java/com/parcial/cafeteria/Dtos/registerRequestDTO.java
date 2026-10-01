package com.parcial.cafeteria.Dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class registerRequestDTO {
    @NotBlank
    private String username;
    
    @Email
    private String email;

    @Size(min = 8)
    private String password;

}
