package com.example.demo.controller;

import com.example.demo.CourseRepository;
import com.example.demo.TeacherRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * Author Janni Jensen-Dahm
 * Date 22. nov. 2018
 */

@RestController
public class CourseRestController {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/teacher/newCourse")
    public RedirectView saveCourse(Course course) {
        courseRepository.save(course);
        return new RedirectView("courseList");
    }

    @PutMapping("/teacher/editCourse/{id}")
    public ResponseEntity editCourse(@PathVariable Long id,
                                   Course course) {
        Course courseEdit = courseRepository.findById(id);
        courseEdit.setNameDanish(course.getNameDanish());
        courseEdit.setNameEnglish(course.getNameEnglish());
        courseEdit.setSemester(course.getSemester());
        courseEdit.setClassCode(course.getClassCode());
        courseEdit.setStudyProgram(course.getStudyProgram());
        courseEdit.setMandatoryOrElective(course.isMandatoryOrElective());
        courseEdit.setEctsPoints(course.getEctsPoints());
        courseEdit.setCourseLanguage(course.getCourseLanguage());
        courseEdit.setMinimumStudents(course.getMinimumStudents());
        courseEdit.setExpectedStudents(course.getExpectedStudents());
        courseEdit.setMaximumStudents(course.getMaximumStudents());
        courseEdit.setPrerequisites(course.getPrerequisites());
        courseEdit.setLearningOutcome(course.getLearningOutcome());
        courseEdit.setContent(course.getContent());
        courseEdit.setLearningActivities(course.getLearningActivities());
        courseEdit.setExamForm(course.getExamForm());
        courseEdit.setTeachers(course.getTeachers());
        courseRepository.save(courseEdit);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/teacher/deleteCourse/{id}")
    public ResponseEntity deleteCourse(@PathVariable Long id){
        courseRepository.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
