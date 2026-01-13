package com.amaris.sis_fondo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FondoDTO {

    private Long id;
    private String nombre;
    private String categoria; //FPV - FIC
    private int montoMinimo;
}
