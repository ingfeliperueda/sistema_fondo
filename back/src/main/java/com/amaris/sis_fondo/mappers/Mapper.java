package com.amaris.sis_fondo.mappers;

import com.amaris.sis_fondo.dto.*;
import com.amaris.sis_fondo.entities.Fondo;
import com.amaris.sis_fondo.entities.Suscripcion;
import com.amaris.sis_fondo.entities.Transaccion;
import com.amaris.sis_fondo.entities.Usuario;

public class Mapper {

    public static FondoDTO toDTO(Fondo f){
        if (f == null) return null;
        return FondoDTO.builder()
                .id(f.getId())
                .nombre(f.getNombre())
                .categoria(f.getCategoria())
                .montoMinimo(f.getMontoMinimo())
                .build();
    }

    public static SuscripcionDTO toDTO(Suscripcion s){
        if (s == null) return null;
        return SuscripcionDTO.builder()
                .id(s.getId())
                .usuario(s.getUsuario())
                .fondo(s.getFondo())
                .fechaSuscripcion(s.getFechaSuscripcion())
                .metodoNotificacion((s.getMetodoNotificacion()))
                .build();

    }

    public static TransaccionDTO toDTO(Transaccion t) {
        if (t == null) return null;
        return TransaccionDTO.builder()
                .id(t.getId())
                .fondo(t.getFondo())
                .tipo(t.getTipo())
                .build();
    }

    public static UsuarioDTO toDTO(Usuario u){
        if (u == null) return null;
        return UsuarioDTO.builder()
                .id(u.getId())
                .nombre((u.getNombre()))
                .build();
    }
}
