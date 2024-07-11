package com.example.demo1.model;

import com.example.demo1.Enum.TIPOESTUDIANTE;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private Integer id;
    private String username;
    private String contrasenia;
    private String correo;
    private TIPOESTUDIANTE tipoestudiante;


}