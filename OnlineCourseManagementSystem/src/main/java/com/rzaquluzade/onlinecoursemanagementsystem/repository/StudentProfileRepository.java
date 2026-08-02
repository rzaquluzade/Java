package com.rzaquluzade.onlinecoursemanagementsystem.repository;


import com.rzaquluzade.onlinecoursemanagementsystem.entity.StudentProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfileEntity, Long> {

}
