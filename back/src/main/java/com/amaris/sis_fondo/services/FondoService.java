package com.amaris.sis_fondo.services;

import com.amaris.sis_fondo.dto.FondoDTO;

import java.util.List;
import java.util.Optional;

public interface  FondoService {

    List<FondoDTO> listarFondos();

    FondoDTO getFondoById(Long id);

}
