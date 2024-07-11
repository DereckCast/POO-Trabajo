package com.example.demo1.service;
import com.example.demo1.model.Estudiante;
import com.example.demo1.repository.IRepoEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEstudiante implements IServiceEstudiante{

    @Autowired
    private IRepoEstudiante repo;

    @Override
    public List<Estudiante> getAll() {
        return repo.findAll();
    }

    @Override
    public void createEstudiante(Estudiante estudiante) {
        repo.save(estudiante);
    }

    @Override
    public void deleteEstudiante(Integer id) {
        repo.deleteById(id);
    }
}
