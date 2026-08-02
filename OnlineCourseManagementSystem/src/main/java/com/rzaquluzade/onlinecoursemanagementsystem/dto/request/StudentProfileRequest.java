package com.rzaquluzade.onlinecoursemanagementsystem.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record StudentProfileRequest (

        @NotBlank(message = "Phone number cannot be blank")
        String phoneNumber,

        @NotBlank(message = "Address cannot be blank")
        String address,

        @NotNull
        LocalDate birthDay,

        @NotNull
        Long studentId
) {}
