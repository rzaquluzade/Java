package com.rzaquluzade.onlinecoursemanagementsystem.dto.request;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public record StudentRequest (

        @NotBlank(message = "First name cannot be blank")
        String firstName,

        @NotBlank(message = "Last name cannot be blank")
        String lastName,

        @NotBlank(message = "Email is not valid")
        String email,

        @Min(value = 18, message = "Age must be at least 18")
        Integer age
) {}

