package br.edu.cefsa.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario {

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", contratacao=" + contratacao +
                ", cargo=" + cargo.getCodigo() + " " + cargo.getNome() +
                ", departamento=" + departamento.getCodigo() + " " + departamento.getNome() +
                '}';
    }

    private Long codigo;

    private String nome;

    private LocalDate nascimento;

    private LocalDateTime contratacao;

    private Cargo cargo;

    private Departamento departamento;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDateTime getContratacao() {
        return contratacao;
    }

    public void setContratacao(LocalDateTime contratacao) {
        this.contratacao = contratacao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcionario(Long codigo, String nome, LocalDate nascimento, LocalDateTime contratacao, Cargo cargo, Departamento departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.contratacao = contratacao;
        this.cargo = cargo;
        this.departamento = departamento;
    }
}

