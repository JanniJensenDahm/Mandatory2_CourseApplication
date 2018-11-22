package com.example.demo.controller;


import com.example.demo.TeacherRepository;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * Author Janni Jensen-Dahm
 * Date 17. nov. 2018
 */

@Controller
public class CourseController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/newCourse")
    public String createNewCourse(Model model){
        ArrayList<Teacher> teachers = (ArrayList<Teacher>) teacherRepository.findAll();
        model.addAttribute("teachers", teachers);
        return "newCourse";
    }
}
