package com.example.demo;

import com.example.demo.model.Session;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SessionRepository extends CrudRepository<Session, Long> {
    List<Session> findAll();
    Session findByUsername(String username);
}
