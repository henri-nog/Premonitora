package model;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

public class Bairro {
    private String nome;
    private int numDesabamentos;

    // Construtor da classe
    public Bairro(String nome, int numDesabamentos) {
        this.nome = nome;
        this.numDesabamentos = numDesabamentos;
    }
    public String getNome() {
        return nome;
    }


    // Getter para o número de desabamentos
    public int getNumDesabamentos() {
        return numDesabamentos;
    }


    // Incrementa desabamentos registrados
    public void incrementarDesabamento(int quantidade) {
        this.numDesabamentos += quantidade;
    }

    // Representação do bairro como texto
    @Override
    public String toString() {
        return nome + " (Desabamentos: " + numDesabamentos + ")";
    }
}




