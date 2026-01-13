package com.amaris.sis_fondo.controllers;

import com.amaris.sis_fondo.dto.UsuarioDTO;
import com.amaris.sis_fondo.mappers.Mapper;
import com.amaris.sis_fondo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioServ;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listarUsuarios(){
        return ResponseEntity.ok(usuarioServ.listarUsuarios());
    }

    @GetMapping("/{id}")
    public UsuarioDTO getUsuario(@PathVariable Long id){
        return usuarioServ.getUsuarioById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> actualizarUsuario(@PathVariable Long id,@RequestBody UsuarioDTO udto){
        return ResponseEntity.ok(usuarioServ.actualizarUsuario(id, udto));
    }

}
