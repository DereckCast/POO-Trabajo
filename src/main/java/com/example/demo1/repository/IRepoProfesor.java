package com.example.demo1.repository;

import com.example.demo1.model.Estudiante;
import com.example.demo1.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoProfesor extends JpaRepository<Profesor,Integer> {
}
