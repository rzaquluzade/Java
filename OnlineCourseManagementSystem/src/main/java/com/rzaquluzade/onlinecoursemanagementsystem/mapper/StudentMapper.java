package com.rzaquluzade.onlinecoursemanagementsystem.mapper;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.StudentRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;


@Component
@RequiredArgsConstructor
public class StudentMapper {

    private final CourseMapper courseMapper;
    private final StudentProfileMapper studentProfileMapper;


    public StudentEntity toEntity(StudentRequest studentRequest) {

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setFirstName(studentRequest.firstName());
        studentEntity.setLastName(studentRequest.lastName());
        studentEntity.setEmail(studentRequest.email());
        studentEntity.setAge(studentRequest.age());
        studentEntity.setCreatedAt(LocalDateTime.now());

        return studentEntity;
    }


    public StudentResponse toResponse(StudentEntity studentEntity) {

        StudentResponse studentResponse = new StudentResponse(
                studentEntity.getId(),
                studentEntity.getFirstName(),
                studentEntity.getLastName(),
                studentEntity.getEmail(),
                studentEntity.getAge(),
                studentEntity.getCreatedAt(),

                studentEntity.getCourses() == null ? List.of() : studentEntity.getCourses()
                        .stream()
                        .map(courseMapper::toResponse)
                        .toList(),

                studentEntity.getProfile() == null ? null
                        : studentProfileMapper.toResponse(studentEntity.getProfile())

                );
        return studentResponse;
    }


    public void updateStudent(StudentEntity studentEntity, StudentRequest studentRequest) {

        studentEntity.setFirstName(studentRequest.firstName());
        studentEntity.setLastName(studentRequest.lastName());
        studentEntity.setEmail(studentRequest.email());
        studentEntity.setAge(studentRequest.age());
    }
}
