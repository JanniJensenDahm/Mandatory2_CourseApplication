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
    @Column(name = "study_program_id")
    private Long studyProgramId;
    @Column(name = "study_program")
    private String studyProgram;

    public StudyProgram() {
    }

    public StudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Long getStudyProgramId() {
        return studyProgramId;
    }

    public void setStudyProgramId(Long studyProgramId) {
        this.studyProgramId = studyProgramId;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }
}
