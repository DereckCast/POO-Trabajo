package com.example.demo1.service;

import com.example.demo1.model.Estudiante;
import com.example.demo1.model.Profesor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceProfesor {
    public List<Profesor> getAll();

    void createProfesor(Profesor profesor);

    void deleteProfesor(Integer id);
}
