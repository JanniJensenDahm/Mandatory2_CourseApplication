package com.example.demo.controller;

import com.example.demo.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Author Janni Jensen-Dahm
 * Date 28. nov. 2018
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/teacher/teacherSite")
    private String teacherSite(){
        return "teacher/teacherSite";
    }
}
