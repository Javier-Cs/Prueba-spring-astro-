package com.example.pruebaConexionAstro.Exceptions;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

// uso de ControlAbvice para las validaciones
@ControllerAdvice
public class GlobalExceptionHandler {

    // uso de exception handler  y dentro MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    // metodo de exception para metodos no validados
    public ResponseEntity<Object> handleValidationexception(MethodArgumentNotValidException ex){
        // uso de un Map para definir los parametros a devolver
        Map<String, Object> cuerpo = new HashMap<>();
        cuerpo.put("Timestamp", LocalDateTime.now());
        cuerpo.put("status", HttpStatus.BAD_REQUEST.value());
        cuerpo.put("Error", "Bad Request");
        String mensajeError = ex.getBindingResult().getFieldError().getDefaultMessage();
        cuerpo.put("message", mensajeError);

        return new ResponseEntity<>(cuerpo, HttpStatus.BAD_REQUEST);
    }
}
