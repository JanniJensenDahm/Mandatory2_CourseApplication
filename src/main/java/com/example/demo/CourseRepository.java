package com.example.demo;

import com.example.demo.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {
    List<Course> findAll();
    Course findById(Long id);
}
