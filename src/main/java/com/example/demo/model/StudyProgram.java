package com.example.demo.model;

import javax.persistence.*;

/**
 * Author Janni Jensen-Dahm
 * Date 22. nov. 2018
 */
@Entity
public class StudyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String studyProgram;

    public StudyProgram() {
    }

    public StudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }
}
