package com.example.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Estudiante {
    @Id
    private Integer id;

    private String nombre;
    private int cif;
    private String contrasenia;
    private String clases_tomada;


}
