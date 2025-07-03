package com.example.pruebaConexionAstro.Service;

import com.example.pruebaConexionAstro.Entity.Formulario;

import java.util.List;

public interface FormularioService {
    Formulario saveForm(Formulario form);
    List<Formulario> listaForm();
}
