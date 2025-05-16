public class Bairro {
    private String nome;
    private int numDesabamentos;

    // Construtor
    public Bairro(String nome, int numDesabamentos) {
        this.nome = nome;
        this.numDesabamentos = numDesabamentos;
    }

    // Getter para o nome do bairro
    public String getNome() {
        return nome;
    }

    // Setter para o nome (opcional, mas pode ser útil)
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o número de desabamentos
    public int getNumDesabamentos() {
        return numDesabamentos;
    }

    // Setter para o número de desabamentos
    public void setNumDesabamentos(int numDesabamentos) {
        this.numDesabamentos = numDesabamentos;
    }

    // Método para incrementar desabamentos
    public void incrementarDesabamento(int quantidade) {
        this.numDesabamentos += quantidade;
    }

    // Representação do bairro como texto (usado nos menus)
    @Override
    public String toString() {
        return nome + " (Desabamentos: " + numDesabamentos + ")";
    }
}
