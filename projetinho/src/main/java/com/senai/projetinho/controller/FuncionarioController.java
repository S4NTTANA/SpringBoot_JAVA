package com.senai.projetinho.controller;

import com.senai.projetinho.model.FuncionarioModel;
import com.senai.projetinho.service.FuncionarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> criar(@Validated @RequestBody FuncionarioModel funcionario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(funcionario));
    }

    @PutMapping
    public ResponseEntity<FuncionarioModel> atualizar(@Validated @RequestBody FuncionarioModel funcionario) {
        return ResponseEntity.ok(service.atualizar(funcionario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}