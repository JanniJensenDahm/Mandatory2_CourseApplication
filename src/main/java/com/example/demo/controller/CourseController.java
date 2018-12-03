package com.example.demo.controller;

import com.example.demo.CourseRepository;
import com.example.demo.StudyProgramRepository;
import com.example.demo.TeacherRepository;
import com.example.demo.model.Course;
import com.example.demo.model.StudyProgram;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * Author Janni Jensen-Dahm
 * Date 17. nov. 2018
 */

@Controller
public class CourseController {

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudyProgramRepository studyProgramRepository;
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/teacher/editCourse/{id}")
    public String editCourse(Model model,
                             @PathVariable Long id){
        Course course = courseRepository.findById(id);
        List<Teacher> teachers = teacherRepository.findAll();
        List<StudyProgram> studyPrograms = studyProgramRepository.findAll();
        model.addAttribute("course", course);
        model.addAttribute("teachers", teachers);
        model.addAttribute("studyPrograms", studyPrograms);
        return "teacher/editCourse";
    }
}
