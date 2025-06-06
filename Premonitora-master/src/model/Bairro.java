package model;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

public class Bairro {
    private String nome;
    private int numRegistros;

    // Construtor da classe
    public Bairro(String nome, int numRegistros) {
        this.nome = nome;
        this.numRegistros = numRegistros;
    }
    public String getNome() {
        return nome;
    }


    // Getter para o número de desabamentos
    public int getNumRegistros() {
        return numRegistros;
    }


    // Incrementa desabamentos registrados
    public void incrementarDesabamento(int quantidade) {
        this.numRegistros += quantidade;
    }

    // Representação do bairro como texto
    @Override
    public String toString() {
        return nome + " (Nº de Registros: " + numRegistros + ")";
    }
}




