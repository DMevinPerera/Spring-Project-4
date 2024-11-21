package com.Spring_Project_4.Spring_Project_4.course.jdbc.springdatajpa;

import com.Spring_Project_4.Spring_Project_4.course.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
}
