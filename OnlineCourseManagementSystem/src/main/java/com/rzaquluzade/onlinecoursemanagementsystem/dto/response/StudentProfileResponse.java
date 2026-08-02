package com.rzaquluzade.onlinecoursemanagementsystem.dto.response;


import java.time.LocalDate;


public record StudentProfileResponse (
        Long id,
        String phoneNumber,
        String address,
        LocalDate birthDay,
        Long studentId
) {}
