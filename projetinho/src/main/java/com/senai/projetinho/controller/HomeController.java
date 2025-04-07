package com.senai.projetinho.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> boasVindas() {
        return ResponseEntity.ok("Bem-vindo à API de Funcionários");
    }

    @GetMapping("/dev")
    public ResponseEntity<String> desenvolvedor() {
        return ResponseEntity.ok("Desenvolvido por: Seu Nome");
    }
}