package com.example.demo.model;

import javax.persistence.*;
/**
 * Author Janni Jensen-Dahm
 * Date 17. nov. 2018
 */
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameDanish;
    private String nameEnglish;
    private int semester;
    private String classCode;
    private String studyProgram;
    private boolean mandatoryOrElective;
    private int ectsPoints;
    private  String courseLanguage;
    private int minimumStudents;
    private int expectedStudents;
    private int maximumStudents;
    private String prerequisites;
    private String learningOutcome;
    private String content;
    private String learningActivities;
    private String examForm;

    public Course() {}

    public Course(String nameDanish, String nameEnglish,
                  int semester, String classCode,
                  String studyProgram, boolean mandatoryOrElective,
                  int ectsPoints, String courseLanguage,
                  int minimumStudents, int expectedStudents,
                  int maximumStudents, String prerequisites,
                  String learningOutcome, String content,
                  String learningActivities, String examForm) {
        this.nameDanish = nameDanish;
        this.nameEnglish = nameEnglish;
        this.semester = semester;
        this.classCode = classCode;
        this.studyProgram = studyProgram;
        this.mandatoryOrElective = mandatoryOrElective;
        this.ectsPoints = ectsPoints;
        this.courseLanguage = courseLanguage;
        this.minimumStudents = minimumStudents;
        this.expectedStudents = expectedStudents;
        this.maximumStudents = maximumStudents;
        this.prerequisites = prerequisites;
        this.learningOutcome = learningOutcome;
        this.content = content;
        this.learningActivities = learningActivities;
        this.examForm = examForm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDanish() {
        return nameDanish;
    }

    public void setNameDanish(String nameDanish) {
        this.nameDanish = nameDanish;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public boolean isMandatoryOrElective() {
        return mandatoryOrElective;
    }

    public void setMandatoryOrElective(boolean mandatoryOrElective) {
        this.mandatoryOrElective = mandatoryOrElective;
    }

    public int getEctsPoints() {
        return ectsPoints;
    }

    public void setEctsPoints(int ectsPoints) {
        this.ectsPoints = ectsPoints;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public int getMinimumStudents() {
        return minimumStudents;
    }

    public void setMinimumStudents(int minimumStudents) {
        this.minimumStudents = minimumStudents;
    }

    public int getExpectedStudents() {
        return expectedStudents;
    }

    public void setExpectedStudents(int expectedStudents) {
        this.expectedStudents = expectedStudents;
    }

    public int getMaximumStudents() {
        return maximumStudents;
    }

    public void setMaximumStudents(int maximumStudents) {
        this.maximumStudents = maximumStudents;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getLearningOutcome() {
        return learningOutcome;
    }

    public void setLearningOutcome(String learningOutcome) {
        this.learningOutcome = learningOutcome;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLearningActivities() {
        return learningActivities;
    }

    public void setLearningActivities(String learningActivities) {
        this.learningActivities = learningActivities;
    }

    public String getExamForm() {
        return examForm;
    }

    public void setExamForm(String examForm) {
        this.examForm = examForm;
    }
}
