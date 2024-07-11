package com.example.demo1.controller;

import com.example.demo1.model.Estudiante;
import com.example.demo1.model.Estudiante;
import com.example.demo1.service.IServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class ControllerEstudiante {


    @Autowired
    private IServiceEstudiante serviceUsuario;

    @GetMapping("/all")
    public ResponseEntity<List<Estudiante>> getAll() {
        List<Estudiante> lista = serviceUsuario.getAll();
        if (lista.isEmpty()) {
            return ResponseEntity.badRequest().body(lista);
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Estudiante estudiante) {
        serviceUsuario.createEstudiante(estudiante);
        return ResponseEntity.ok("Usuario creado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Estudiante estudiante) {
        serviceUsuario.createEstudiante(estudiante);
        return ResponseEntity.ok("Usuario actualizado");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id ) {
        serviceUsuario.deleteEstudiante(id);
        return ResponseEntity.ok("Usuario borrado");
    }

}
