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

    @GetMapping("/newCourse")
    public String createNewCourse(Model model){
        model.addAttribute("course", new Course());
        ArrayList<Teacher> teachers = (ArrayList<Teacher>) teacherRepository.findAll();
        ArrayList<StudyProgram> studyPrograms = (ArrayList<StudyProgram>) studyProgramRepository.findAll();
        model.addAttribute("teachers", teachers);
        model.addAttribute("studyPrograms", studyPrograms);

        return "newCourse";
    }

    @GetMapping("/courseList")
    public String couseList(Model model){
        List<Course> courses = (List<Course>) courseRepository.findAll();
        System.out.println(courses);
        model.addAttribute("courses", courses);
        return "courseList";
    }

    @GetMapping("/editCourse")
    public String editCourse(Model model){

        return "editCourse";
    }

}
