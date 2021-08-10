package org.me.jdbcaula;

public class Aluno {
    
    private int id, idade;
    private String nome, estado;

    public Aluno(){}

    public Aluno(String nome, int idade, String estado){

        this.estado = estado;
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(int id, String nome, int idade, String estado){

        this.id = id;
        this.estado = estado;
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        String resultado = String.format("Id: %d - Nome: %s - Idade: %d - Estado: %s", id, nome, idade, estado);
        return resultado;
    }
}
