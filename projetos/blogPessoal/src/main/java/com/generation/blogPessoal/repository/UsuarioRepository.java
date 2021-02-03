package com.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.blogPessoal.model.Usuario;
import com.sun.el.stream.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long >{
public Optional findByUsuario(String usuario);
}
