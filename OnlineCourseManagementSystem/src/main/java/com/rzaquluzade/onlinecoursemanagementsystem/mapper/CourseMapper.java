package com.rzaquluzade.onlinecoursemanagementsystem.mapper;


import com.rzaquluzade.onlinecoursemanagementsystem.dto.request.CourseRequest;
import com.rzaquluzade.onlinecoursemanagementsystem.dto.response.CourseResponse;
import com.rzaquluzade.onlinecoursemanagementsystem.entity.CourseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class CourseMapper {


    public CourseEntity toEntity(CourseRequest courseRequest) {

        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setName(courseRequest.name());
        courseEntity.setDescription(courseRequest.description());
        courseEntity.setPrice(courseRequest.price());
        courseEntity.setDuration(courseRequest.duration());
        courseEntity.setCreatedAt(LocalDateTime.now());

        return courseEntity;
    }


    public CourseResponse toResponse(CourseEntity courseEntity) {

        CourseResponse courseResponse = new CourseResponse(
                courseEntity.getId(),
                courseEntity.getName(),
                courseEntity.getDescription(),
                courseEntity.getPrice(),
                courseEntity.getDuration(),
                courseEntity.getCreatedAt()
        );
        return courseResponse;
    }
}

