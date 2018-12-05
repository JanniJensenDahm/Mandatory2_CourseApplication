package com.example.demo.controller;

import com.example.demo.RoleRepository;
import com.example.demo.SessionRepository;
import com.example.demo.StudentRepository;
import com.example.demo.model.Role;
import com.example.demo.model.Session;
import com.example.demo.model.Student;
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
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/admin/newStudent")
    public String newStudent(Model model){
        List<Student> students = studentRepository.findAll();
        List<Session> sessions = sessionRepository.findAll();
        List<Role> roles = roleRepository.findAll();
        model.addAttribute("students", students);
        model.addAttribute("sessions", sessions);
        model.addAttribute("roles", roles);
        model.addAttribute("student", new Student());

        return "newPerson";
    }
}
