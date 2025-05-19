public class Bairro {
    private final String nome;
    private int numDesabamentos;

    public Bairro(String nome, int numDesabamentos) {
        this.nome = nome;
        this.numDesabamentos = numDesabamentos;
    }

    public String getNome() {
        return nome;
    }

    public int getNumDesabamentos() {
        return numDesabamentos;
    }

    public void incrementarDesabamento(int quantidade) {
        this.numDesabamentos += quantidade;
    }

    @Override
    public String toString() {
        return nome + " (Desabamentos: " + numDesabamentos + ")";
    }
}
