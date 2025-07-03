package com.example.pruebaConexionAstro.Service;

import com.example.pruebaConexionAstro.Entity.Formulario;
import com.example.pruebaConexionAstro.Repository.FormularioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FormServiceImpl implements FormularioService {
    private final FormularioRepository formRepository;


    public FormServiceImpl(FormularioRepository formRepository) {
        this.formRepository = formRepository;
    }


    @Override
    @Transactional
    public Formulario saveForm(Formulario form) {
        return formRepository.save(form);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Formulario> listaForm() {
        List<Formulario> listaForm = formRepository.findAll();
        return listaForm;
    }
}
