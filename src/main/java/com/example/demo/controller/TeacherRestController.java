package com.example.demo.controller;

import com.example.demo.RoleRepository;
import com.example.demo.SessionRepository;
import com.example.demo.TeacherRepository;
import com.example.demo.model.Role;
import com.example.demo.model.Session;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Author Janni Jensen-Dahm
 * Date 28. nov. 2018
 */
@RestController
public class TeacherRestController {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/admin/newTeacher")
    public RedirectView saveCourse(Teacher teacher, Session session) {
        teacherRepository.save(teacher);
        return new RedirectView("teacherList");
    }

}
