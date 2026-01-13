package com.amaris.sis_fondo.repositories;

import com.amaris.sis_fondo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>
{


}
