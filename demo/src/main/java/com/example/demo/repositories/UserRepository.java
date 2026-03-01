package com.example.demo.repositories;

import com.example.demo.entities.EntityUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<EntityUsers, Long> {
}
