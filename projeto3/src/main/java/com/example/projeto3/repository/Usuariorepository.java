package com.example.projeto3.repository;


import com.example.projeto3.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuariorepository extends JpaRepository<Usuario, Long> {
}
