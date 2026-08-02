package com.rzaquluzade.onlinecoursemanagementsystem.controller;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.CourseRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.CourseResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;


    @PostMapping
    public CourseResponse createCourse(@Valid @RequestBody CourseRequest courseRequest) {
        return courseService.createCourse(courseRequest);
    }


    @GetMapping
    public List<CourseResponse> getAllCourses() {
        return courseService.getAllCourses();
    }


    @GetMapping("/{id}")
    public CourseResponse getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

}
