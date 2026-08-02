package com.rzaquluzade.onlinecoursemanagementsystem.controller;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.StudentProfileRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentProfileResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.service.StudentProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student-profile")
public class StudentProfileController {

    private final StudentProfileService studentProfileService;


    @PostMapping
    public StudentProfileResponse createStudentProfile(@Valid @RequestBody StudentProfileRequest studentProfileRequest) {
        return studentProfileService.createStudentProfile(studentProfileRequest);
    }


    @GetMapping("/{id}")
    public StudentProfileResponse getStudentProfileById(@PathVariable Long id) {
        return studentProfileService.getStudentProfileById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteStudentProfile(@PathVariable Long id) {
        studentProfileService.deleteStudentProfile(id);
    }

}
