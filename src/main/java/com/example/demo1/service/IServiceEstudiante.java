package com.example.demo1.service;

import com.example.demo1.model.Estudiante;
import com.example.demo1.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceEstudiante {

    public List<Estudiante> getAll();

    void createEstudiante(Estudiante estudiante);

    void deleteEstudiante(Integer id);
}
