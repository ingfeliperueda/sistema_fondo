package com.amaris.sis_fondo.dto;

import com.amaris.sis_fondo.entities.Fondo;
import com.amaris.sis_fondo.entities.Usuario;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransaccionDTO {

    private Long id;
    private Usuario usuario;
    private Fondo fondo;
    private String tipo;
    private int monto;
    private LocalDateTime fecha;
    private int saldoPosterior;
}
