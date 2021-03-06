package br.edu.cefsa.model;

public class Departamento {

    private Long codigo;

    private String nome;

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

    public Departamento(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
