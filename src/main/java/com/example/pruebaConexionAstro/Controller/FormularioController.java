package com.example.pruebaConexionAstro.Controller;

import com.example.pruebaConexionAstro.Entity.Formulario;
import com.example.pruebaConexionAstro.Service.FormServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ApiForm/v1")
public class FormularioController {

    private final FormServiceImpl formService;

    public FormularioController(FormServiceImpl formService) {
        this.formService = formService;
    }


    @PostMapping("/save")
    public ResponseEntity<Formulario> postFormulario(@RequestBody Formulario form) {
        Formulario formulario = formService.saveForm(form);
        return ResponseEntity.status(HttpStatus.CREATED).body(formulario);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Formulario>> getFormulario() {
        List<Formulario> formularios = formService.listaForm();
        if (formularios.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(formularios);
    }
}
