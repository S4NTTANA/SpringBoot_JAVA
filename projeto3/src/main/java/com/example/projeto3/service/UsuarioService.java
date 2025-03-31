package com.example.projeto3.service;


import com.example.projeto3.model.Usuario;
import com.example.projeto3.repository.Usuariorepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private Usuariorepository usuariorepository;

    public UsuarioService(Usuariorepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }


    public List<Usuario> listarTodos() {
        return usuariorepository.findAll();
    }

    public Usuario salvar(@Valid Usuario usuario) {
        if (usuariorepository.findById(usuario.getId()).isPresent()) {
            throw new RuntimeException("Email não encontrado!");
        }
        return usuariorepository.save(usuario);
    }
    public void excluir(Long id) {
        Usuario usuario = usuariorepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado!"));

        usuariorepository.deleteById(id);
    }

}
