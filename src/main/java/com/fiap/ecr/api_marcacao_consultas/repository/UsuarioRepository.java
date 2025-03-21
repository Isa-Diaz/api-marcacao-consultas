package com.fiap.ecr.api_marcacao_consultas.repository;
<<<<<<< HEAD

import com.fiap.ecr.api_marcacao_consultas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    List<Usuario> findByTipo(String tipo);
}
=======
import com.fiap.ecr.api_marcacao_consultas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
>>>>>>> 2135768f7e001f77c966dcaae5e81c96e22482d2
