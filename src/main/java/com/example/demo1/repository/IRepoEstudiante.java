package com.example.demo1.repository;

import com.example.demo1.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoEstudiante extends JpaRepository<Estudiante,Integer> {
}
