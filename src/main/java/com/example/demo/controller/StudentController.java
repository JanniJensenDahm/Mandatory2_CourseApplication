package com.example.demo.controller;

import com.example.demo.*;
import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Author Janni Jensen-Dahm
 * Date 17. nov. 2018
 */
@Controller
public class StudentController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudyProgramRepository studyProgramRepository;

    @GetMapping("/student/courseList")
    public String couseList(Model model){
        List<Teacher> teachers = teacherRepository.findAll();
        List<StudyProgram> studyPrograms = studyProgramRepository.findAll();
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("teachers", teachers);
        model.addAttribute("studyPrograms", studyPrograms);
        model.addAttribute("courses", courses);
        return "student/courseList";
    }

    @GetMapping("/student/showCourse/{id}")
    public String showCourse(@PathVariable Long id, Model model){
        Course course = courseRepository.findById(id);
        List<Teacher> teachers = teacherRepository.findAll();
        List<StudyProgram> studyPrograms = studyProgramRepository.findAll();
        model.addAttribute(course);
        model.addAttribute(teachers);
        model.addAttribute(studyPrograms);

        return "student/showCourse";
    }
}
