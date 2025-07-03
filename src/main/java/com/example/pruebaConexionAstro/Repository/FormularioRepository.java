package com.example.pruebaConexionAstro.Repository;

import com.example.pruebaConexionAstro.Entity.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario,Integer> {
}
