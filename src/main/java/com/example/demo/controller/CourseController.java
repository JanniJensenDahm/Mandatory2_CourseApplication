package com.example.demo.controller;

import com.example.demo.CourseRepository;
import com.example.demo.StudentRepository;
import com.example.demo.StudyProgramRepository;
import com.example.demo.TeacherRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.StudyProgram;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private StudentRepository studentRepository;

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

    @GetMapping("/admin/addStudent/{id}")
    public String addStudent(Model model, @PathVariable Long id){
        Course course = courseRepository.findById(id);
        List<Student> students = studentRepository.findAll();
        model.addAttribute("course", course);
        model.addAttribute("students", students);
        return "admin/addStudent";
    }
}
