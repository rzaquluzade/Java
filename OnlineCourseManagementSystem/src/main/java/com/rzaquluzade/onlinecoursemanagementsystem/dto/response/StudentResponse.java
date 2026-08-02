package com.rzaquluzade.onlinecoursemanagementsystem.dto.response;


import java.time.LocalDateTime;
import java.util.List;


public record StudentResponse (
        Long id,
        String firstName,
        String lastName,
        String email,
        Integer age,
        LocalDateTime createdAt,
        List<CourseResponse> courses,
        StudentProfileResponse profile
) {}
