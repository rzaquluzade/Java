package com.rzaquluzade.onlinecoursemanagementsystem.service;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.StudentProfileRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentProfileResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentEntity;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentProfileEntity;
import com.rzaquluzade.onlinecoursemanagementsystem.mapper.StudentProfileMapper;
import com.rzaquluzade.onlinecoursemanagementsystem.repository.StudentProfileRepository;
import com.rzaquluzade.onlinecoursemanagementsystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class StudentProfileService {

    private final StudentProfileRepository studentProfileRepository;
    private final StudentProfileMapper studentProfileMapper;
    private final StudentRepository studentRepository;

    // POST / student-profiles
    public StudentProfileResponse createStudentProfile(StudentProfileRequest studentProfileRequest) {

        StudentEntity studentEntity = studentRepository.findById(studentProfileRequest.studentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        StudentProfileEntity studentProfileEntity = studentProfileMapper.toEntity(studentProfileRequest);

        studentProfileEntity.setStudent(studentEntity);

        StudentProfileEntity saveStudentProfile = studentProfileRepository.save(studentProfileEntity);

        return studentProfileMapper.toResponse(saveStudentProfile);
    }


    // GET / student-profiles/{id}
    public StudentProfileResponse getStudentProfileById(Long id) {

        StudentProfileEntity studentProfileEntity = studentProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student profile not found"));

        return studentProfileMapper.toResponse(studentProfileEntity);
    }


    // DELETE / student-profile{id}
    public void deleteStudentProfile(Long id) {

        studentProfileRepository.deleteById(id);
    }

}
