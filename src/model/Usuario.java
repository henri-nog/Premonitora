package model;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

public class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String endereco;
    private String senha;

    public Usuario() {
        System.out.println("Sua segurança começa aqui.");
    }

    // Construtor com parâmetros
    public Usuario(String nome, String cpf, int idade, String endereco, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.senha = senha;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método para trocar a senha
    public void trocarSenha(String senhaAtual, String novaSenha) {
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta.");
        }
    }
}
