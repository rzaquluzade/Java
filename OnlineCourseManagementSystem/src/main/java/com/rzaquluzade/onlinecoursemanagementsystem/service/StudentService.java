package com.rzaquluzade.onlinecoursemanagementsystem.service;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.StudentRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentEntity;
import com.rzaquluzade.onlinecoursemanagementsystem.mapper.StudentMapper;
import com.rzaquluzade.onlinecoursemanagementsystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    // POST / students
    public StudentResponse createStudent(StudentRequest studentRequest) {

        StudentEntity studentEntity = studentMapper.toEntity(studentRequest);

        StudentEntity saveStudent = studentRepository.save(studentEntity);

        return studentMapper.toResponse(saveStudent);
    }


    // GET / students
    public Page<StudentResponse> getAllStudents(Pageable pageable) {

        return studentRepository.findAll(pageable)
                .map(studentMapper::toResponse);
    }


    // GET / students/{id}
    public StudentResponse getStudentById(Long id) {

        StudentEntity studentEntity = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        return studentMapper.toResponse(studentEntity);
    }


    // PUT / students/{id}
    public StudentResponse updateStudent(Long id, StudentRequest studentRequest) {

        StudentEntity studentEntity = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        studentMapper.updateStudent(studentEntity, studentRequest);

        StudentEntity updateStudent = studentRepository.save(studentEntity);

        return studentMapper.toResponse(updateStudent);
    }


    // DELETE / students/{id}
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
