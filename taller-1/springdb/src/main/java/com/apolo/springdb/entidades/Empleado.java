package com.apolo.springdb.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity

public class Empleado {

    @Id //Declara una clave primaria
    @GeneratedValue( strategy = GenerationType.AUTO) //genera un ID automáticamente
    private Integer id;
    private String email;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate registro;

}
