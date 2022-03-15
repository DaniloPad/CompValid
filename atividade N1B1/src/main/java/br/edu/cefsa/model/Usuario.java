package br.edu.cefsa.model;

import java.time.LocalDate;

public class Usuario {

    private String nome;

    private LocalDate dataNascimento;

    private String senha;

    private Integer idade;

    public static Usuario getInstance() {
        return new Usuario();
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Usuario setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
        return this;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                ", dataNascimento = " + dataNascimento +
                ", senha = " + senha +
                ", idade = " + idade;
    }
}
