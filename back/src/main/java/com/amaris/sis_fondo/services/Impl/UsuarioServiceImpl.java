package com.amaris.sis_fondo.services.Impl;

import com.amaris.sis_fondo.dto.UsuarioDTO;
import com.amaris.sis_fondo.entities.Usuario;
import com.amaris.sis_fondo.exceptions.NotFoundException;
import com.amaris.sis_fondo.mappers.Mapper;
import com.amaris.sis_fondo.repositories.UsuarioRepository;
import com.amaris.sis_fondo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioRepo.findAll()
                .stream()
                .map(Mapper::toDTO)
                .toList();
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id){
        Usuario usu = usuarioRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("usuario no encontrado con id: " + id));
        return Mapper.toDTO(usu);

    }

    @Override
    public UsuarioDTO actualizarUsuario(Long id, UsuarioDTO usuarioDto) {
        Usuario usu = usuarioRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("usuario no encontrado con id: " + id));

        usu.setNombre(usuarioDto.getNombre());

        return Mapper.toDTO(usuarioRepo.save(usu));
    }
}
