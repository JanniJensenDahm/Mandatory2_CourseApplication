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
public class AdminController {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/admin/courseList")
    public String courseList(Model model){
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "admin/courseList";
    }

    @GetMapping("/admin/teacherList")
    public String teacherList(Model model){
        List<Teacher> teachers = teacherRepository.findAll();
        List<Session> sessions = sessionRepository.findAll();
        List<Role> roles = roleRepository.findAll();
        model.addAttribute("teacher", new Teacher());
        model.addAttribute("teachers", teachers);
        model.addAttribute("sessions", sessions);
        model.addAttribute("roles", roles);
        return "admin/teacherList";
    }

    @GetMapping("/admin/studentList")
    public String studentList(Model model){
        List<Student> students = studentRepository.findAll();
        List<Session> sessions = sessionRepository.findAll();
        List<Role> roles = roleRepository.findAll();
        model.addAttribute("student", new Student());
        model.addAttribute("students", students);
        model.addAttribute("sessions", sessions);
        model.addAttribute("roles", roles);
        return "admin/studentList";
    }

    @GetMapping("/admin/courseStudents/{id}")
    public String courseStudents(Model model, @PathVariable Long id){
        Course course = courseRepository.findById(id);
        List<Student> students = studentRepository.findAll();
        model.addAttribute("course", course);
        model.addAttribute("students", students);
        return "admin/courseStudents";
    }
}
