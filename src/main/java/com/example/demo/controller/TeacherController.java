package com.example.demo.controller;

import com.example.demo.*;
import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Author Janni Jensen-Dahm
 * Date 17. nov. 2018
 */
@Controller
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudyProgramRepository studyProgramRepository;
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/teacher/courseList")
    public String couseList(Model model){
        List<Teacher> teachers = teacherRepository.findAll();
        List<StudyProgram> studyPrograms = studyProgramRepository.findAll();
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("course", new Course());
        model.addAttribute("teachers", teachers);
        model.addAttribute("studyPrograms", studyPrograms);
        model.addAttribute("courses", courses);
        return "teacher/courseList";
    }
}
