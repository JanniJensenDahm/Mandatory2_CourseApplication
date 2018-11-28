package com.example.demo;

import com.example.demo.model.StudyProgram;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudyProgramRepository extends CrudRepository<StudyProgram, Long> {
    List<StudyProgram> findAll();
}
