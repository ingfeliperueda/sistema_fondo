package com.amaris.sis_fondo.controllers;

import com.amaris.sis_fondo.dto.FondoDTO;
import com.amaris.sis_fondo.entities.Fondo;
import com.amaris.sis_fondo.services.FondoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/fondos")
@CrossOrigin("*")
public class FondoController {

    @Autowired
    private FondoService fondoService;

    @GetMapping
    public ResponseEntity<List<FondoDTO>> listarFondos() {
        return ResponseEntity.ok(fondoService.listarFondos());
    }

    @GetMapping("/{id}")
    public FondoDTO getFondo(@PathVariable Long id){
        return fondoService.getFondoById(id);
    }

}
