package br.edu.cefsa.model;

public class Cargo {

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

    public Cargo(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
