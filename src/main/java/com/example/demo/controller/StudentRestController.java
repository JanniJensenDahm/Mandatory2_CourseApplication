package com.example.demo.controller;

import com.example.demo.StudentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Author Janni Jensen-Dahm
 * Date 03. dec. 2018
 */
@RestController
public class StudentRestController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/admin/newStudent")
    public RedirectView newStudent(Student student){
        studentRepository.save(student);
        return new RedirectView("studentList");
    }
}
