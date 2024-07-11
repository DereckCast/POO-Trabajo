package com.example.demo1.controller;

import com.example.demo1.model.Estudiante;
import com.example.demo1.model.Profesor;
import com.example.demo1.service.IServiceProfesor;
import com.example.demo1.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/profesor")
public class ControllerProfesor {
    @Autowired
    private IServiceProfesor serviceProfesor;

    @GetMapping("/all")
    public ResponseEntity<List<Profesor>> getAll() {
        List<Profesor> lista = serviceProfesor.getAll();
        if (lista.isEmpty()) {
            return ResponseEntity.badRequest().body(lista);
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Profesor profesor) {
        serviceProfesor.createProfesor(profesor);
        return ResponseEntity.ok("Su cuenta como profesor ha sido creada");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Profesor profesor) {
        serviceProfesor.createProfesor(profesor);
        return ResponseEntity.ok("Usuario actualizado");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id ) {
        serviceProfesor.deleteProfesor(id);
        return ResponseEntity.ok("Usuario borrado");
    }
}
