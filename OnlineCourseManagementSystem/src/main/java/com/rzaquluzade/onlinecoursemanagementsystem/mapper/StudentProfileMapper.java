package com.rzaquluzade.onlinecoursemanagementsystem.mapper;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.StudentProfileRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.StudentProfileResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentProfileEntity;
import org.springframework.stereotype.Component;


@Component
public class StudentProfileMapper {

    public StudentProfileEntity toEntity(StudentProfileRequest studentProfileRequest) {

        StudentProfileEntity studentProfileEntity = new StudentProfileEntity();

        studentProfileEntity.setPhoneNumber(studentProfileRequest.phoneNumber());
        studentProfileEntity.setAddress(studentProfileRequest.address());
        studentProfileEntity.setBirthDay(studentProfileRequest.birthDay());

        return  studentProfileEntity;
    }


    public StudentProfileResponse toResponse(StudentProfileEntity studentProfileEntity) {

        StudentProfileResponse studentProfileResponse = new StudentProfileResponse(
                studentProfileEntity.getId(),
                studentProfileEntity.getPhoneNumber(),
                studentProfileEntity.getAddress(),
                studentProfileEntity.getBirthDay(),
                studentProfileEntity.getStudent().getId()
        );
        return studentProfileResponse;
    }
}
