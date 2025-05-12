public class Login {
    private String nomeUsuario; //modificado
    private String senha;
    private boolean digital; //modificado

    public Login(String nomeUsuario, boolean digital) {
        System.out.println("\nOlá, bem-vindo(a) ao Premonitora.\n");
                            this.nomeUsuario = nomeUsuario;
                            senha = "1234";
                            this.digital = digital;
    }

    @Override
    public String toString() {
        String informacoes = String.format("Seu nome é %s e sua impressão digital consta como: %b.",
                nomeUsuario,
                digital);
        return informacoes;
    }

    public boolean getDigital() { //modificado
        return digital;
    }

    public void setDigital(boolean digital) { //modificado
        this.digital = digital;
    }

    public String getNomeUsuario() { //modificado
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) { //modificado
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
