package org.example;

public class Personagem {

        String nome;
        String tipo;
        int nivel;
        protected int id;
        String tipoPoder;

        // Construtor padrão
        public Personagem(int ID) {
            this.id = ID;
            this.nome = "indefinido";
            this.tipo = "indefinido";
            this.nivel = 0;
            this.tipoPoder = "indefinido";
        }

        // Método para imprimir os dados do personagem
        public void imprimeDados() {
            System.out.println("Personagem do tipo " + this.tipo + " com ID = " + this.id);
            System.out.println("Possui nivel " + this.nivel + " e se chama " + this.nome);
        }

}
