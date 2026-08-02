package com.rzaquluzade.onlinecoursemanagementsystem.controller;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.StudentRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;


    @PostMapping
    public StudentResponse createStudent(@Valid @RequestBody StudentRequest studentRequest) {
        return studentService.createStudent(studentRequest);
    }


    @GetMapping
    public Page<StudentResponse> getAllStudents(Pageable pageable) {
        return studentService.getAllStudents(pageable);
    }


    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    @PutMapping("/{id}")
    public StudentResponse updateStudent(@PathVariable Long id,
                                         @Valid @RequestBody StudentRequest studentRequest) {
        return studentService.updateStudent(id, studentRequest);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

}
