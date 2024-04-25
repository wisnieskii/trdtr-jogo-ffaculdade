package org.example;

public class Dragao extends Personagem {
    int peso;
    int atividade;
    boolean ocupado;

    // Construtor padrão
    public Dragao(int ID) {
        super(ID);
        this.tipo = "dragao";
        this.nome = "indefinido";
        this.atividade = 0;
        this.ocupado = false;
    }

    // Construtor sobrecarregado
    public Dragao(int ID, String nome) {
        super(ID);
        this.tipo = "dragao";
        this.nome = nome;
        this.atividade = 0;
        this.ocupado = false;
    }

    // Método para realizar uma atividade
    public void atuar(int codigo) {
        this.imprimeDados();
        System.out.println("Vai executar uma atividade do tipo " + codigo);
    }
}
