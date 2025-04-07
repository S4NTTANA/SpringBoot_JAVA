package com.senai.projetinho.model;

    import jakarta.persistence.*;
    import jakarta.validation.constraints.*;

    @Entity
    @Table(name = "funcionarios")
    public class FuncionarioModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        private String nome;

        @Email
        @NotBlank
        @Column(unique = true)
        private String email;

        @NotNull
        @Enumerated(EnumType.STRING)
        private Sexo sexo;

        @Positive
        private double salario;

        @Embedded
        private Endereco endereco;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Sexo getSexo() {
            return sexo;
        }

        public void setSexo(Sexo sexo) {
            this.sexo = sexo;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
    }