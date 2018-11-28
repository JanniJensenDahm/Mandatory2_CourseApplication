package com.example.demo.controller;

import com.example.demo.RoleRepository;
import com.example.demo.SessionRepository;
import com.example.demo.TeacherRepository;
import com.example.demo.model.Role;
import com.example.demo.model.Session;
import com.example.demo.model.Teacher;
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
    private SessionRepository sessionRepository;
    @Autowired
    private RoleRepository roleRepository;

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
}
