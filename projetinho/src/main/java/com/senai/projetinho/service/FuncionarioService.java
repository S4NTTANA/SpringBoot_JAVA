package com.senai.projetinho.service;

import com.senai.projetinho.exception.EmailDuplicadoException;
import com.senai.projetinho.exception.RecursoNaoEncontradoException;
import com.senai.projetinho.model.FuncionarioModel;
import com.senai.projetinho.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Service
@Validated
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<FuncionarioModel> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionario) {
        if (funcionarioRepository.existsByEmail(funcionario.getEmail())) {
            throw new EmailDuplicadoException("Email já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public FuncionarioModel atualizar(FuncionarioModel funcionario) {
        funcionarioRepository.findById(funcionario.getId())
            .orElseThrow(() -> new RecursoNaoEncontradoException("Funcionário não encontrado"));
        return funcionarioRepository.save(funcionario);
    }

    public void deletar(Long id) {
        funcionarioRepository.findById(id)
            .orElseThrow(() -> new RecursoNaoEncontradoException("Funcionário não encontrado"));
        funcionarioRepository.deleteById(id);
    }
}