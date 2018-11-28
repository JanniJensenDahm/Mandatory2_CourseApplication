package com.example.demo;

import com.example.demo.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findAll();
    Role findById(Long id);
}
