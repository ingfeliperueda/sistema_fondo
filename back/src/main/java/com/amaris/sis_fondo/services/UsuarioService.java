
package com.amaris.sis_fondo.services;

import com.amaris.sis_fondo.dto.UsuarioDTO;
import com.amaris.sis_fondo.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<UsuarioDTO> listarUsuarios();
    UsuarioDTO getUsuarioById(Long id);
    UsuarioDTO actualizarUsuario(Long id,UsuarioDTO usuarioGto);
}
