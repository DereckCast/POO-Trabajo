package com.example.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
@Entity
@Data
public class Profesor {
    @Id
    private Integer id;

    private String nombre_prof;
    private int cif_prof;
    private char contrasenia_prof;
    private char clases_impartidas;


}
