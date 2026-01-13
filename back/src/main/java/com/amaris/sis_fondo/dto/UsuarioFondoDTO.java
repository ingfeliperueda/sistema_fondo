package com.amaris.sis_fondo.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioFondoDTO {

    private Long id;

    //datos del usuario
    private Long idUsuario;

    private String nombreUsu;

    //datos del fondo
    private Long idFondo;

    private String nombreFondo;
}
