package com.example.pruebaConexionAstro.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "formulario_TBL")
@Data
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idform")
    private int id;


    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 80, message = "El nombre no puede exceder 80 caracteres")
    @Column(name = "nombre")
    private String nombre;


    @NotBlank(message = "El correo es obligatorio")
    @Email(message="El correo debe ser válido")
    @Size(max = 100, message = "El correo no puede exceder 100 caracteres")
    @Column(name = "correo")
    private String email;


    @NotBlank(message = "El mensaje es obligatorio")
    @Column(name = "mensaje")
    private String mensaje;
}
