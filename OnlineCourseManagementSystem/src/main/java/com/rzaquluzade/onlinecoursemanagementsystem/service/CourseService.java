package com.rzaquluzade.onlinecoursemanagementsystem.service;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.CourseRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.CourseResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.CourseEntity;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentEntity;
import com.rzaquluzade.onlinecoursemanagementsystem.mapper.CourseMapper;
import com.rzaquluzade.onlinecoursemanagementsystem.repository.CourseRepository;
import com.rzaquluzade.onlinecoursemanagementsystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;
    private final StudentRepository studentRepository;


    // POST / courses
    public CourseResponse createCourse(CourseRequest courseRequest) {

        StudentEntity studentEntity = studentRepository.findById(courseRequest.studentId())
                .orElseThrow(() -> new RuntimeException("Course not found"));

        CourseEntity courseEntity = courseMapper.toEntity(courseRequest);

        courseEntity.setStudent(studentEntity);

        CourseEntity saveCourse = courseRepository.save(courseEntity);

        return courseMapper.toResponse(saveCourse);
    }


    // GET / courses
    public List<CourseResponse> getAllCourses() {

        return courseRepository.findAll().stream()
                .map(courseMapper::toResponse)
                .toList();
    }


    // GET / courses/{id}
    public CourseResponse getCourseById(Long id) {

        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        return courseMapper.toResponse(courseEntity);
    }


    // DELETE / courses/{id}
    public void deleteCourse(Long id) {

        courseRepository.deleteById(id);
    }
}
