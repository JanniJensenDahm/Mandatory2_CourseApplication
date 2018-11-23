package com.example.demo.controller;

import com.example.demo.CourseRepository;
import com.example.demo.TeacherRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author Janni Jensen-Dahm
 * Date 22. nov. 2018
 */

@RestController
public class CourseRestController {

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/newCourse")
    public ResponseEntity<Course> saveCourse(Course course){
        Course newCourse = courseRepository.save(course);
        return new ResponseEntity(newCourse, HttpStatus.OK);
    }

}
