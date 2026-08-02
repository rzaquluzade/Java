package com.rzaquluzade.onlinecoursemanagementsystem.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record CourseRequest (

       @NotBlank(message = "Name cannot be blank")
       String name,

       @NotBlank
       String description,

       @NotNull(message = "Price cannot be null")
       Double price,

       @NotBlank
       String duration,

       @NotNull
       Long studentId
) {}
