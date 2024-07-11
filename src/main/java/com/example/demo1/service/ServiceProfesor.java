package com.example.demo1.service;

import com.example.demo1.model.Profesor;
import com.example.demo1.repository.IRepoProfesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceProfesor implements IServiceProfesor{

    @Autowired
    private IRepoProfesor repo;
    @Override
    public List<Profesor> getAll() {
        return repo.findAll();
    }

    @Override
    public void createProfesor(Profesor profesor) {
        repo.save(profesor);

    }

    @Override
    public void deleteProfesor(Integer id) {
        repo.deleteById(id);

    }
}
