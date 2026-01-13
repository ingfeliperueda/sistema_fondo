package com.amaris.sis_fondo.services.Impl;

import com.amaris.sis_fondo.dto.FondoDTO;
import com.amaris.sis_fondo.entities.Fondo;
import com.amaris.sis_fondo.exceptions.NotFoundException;
import com.amaris.sis_fondo.mappers.Mapper;
import com.amaris.sis_fondo.repositories.FondoRepository;
import com.amaris.sis_fondo.services.FondoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FondoServiceImpl implements FondoService {

    @Autowired
    private FondoRepository fondoRepo;

    @Override
    public List<FondoDTO> listarFondos() {
        return fondoRepo.findAll()
                .stream()
                .map(Mapper::toDTO)
                .toList();
    }

    @Override
    public FondoDTO getFondoById(Long id) {
        Fondo fondo = fondoRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Fondo no encontrado con id: " + id));
        return Mapper.toDTO(fondo);
    }
}
