package com.rzaquluzade.onlinecoursemanagementsystem.dto.response;


import java.time.LocalDateTime;


public record CourseResponse (
        Long id,
        String name,
        String description,
        Double price,
        String duration,
        LocalDateTime createdAt
) {}
