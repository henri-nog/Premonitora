import java.util.Scanner;

public class Perfil {
    private String nome;
    private String cpf;
    private int idade;
    private String endereco;
    private Bairro bairroAtual;
    private String senha;  // Campo para armazenar a senha

    // Métodos getters e setters
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

    public Bairro getBairroAtual() {
        return bairroAtual;
    }

    public void setBairroAtual(Bairro bairroAtual) {
        this.bairroAtual = bairroAtual;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método para trocar a senha
    public void trocarSenha(Scanner scanner) {
        System.out.print("Digite a senha atual: ");
        String senhaAtual = scanner.nextLine();

        if (senhaAtual.equals(this.senha)) {
            System.out.print("Digite a nova senha: ");
            String novaSenha = scanner.nextLine();
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta.");
        }
    }

    // Método para assinar o modo Premium
    public void assinarModoPremium(Scanner scanner) {
        System.out.println("\nDeseja assinar o Modo Premium?");
        System.out.println("Premium Vigilante R$ 0 por 1 mês. Depois é só R$ 11,90/mês");
        System.out.println("1. Assinar Modo Premium");
        System.out.println("2. Cancelar Modo Premium");

        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            System.out.println("Você assinou o Modo Premium com sucesso!");
        } else if (escolha.equals("2")) {
            System.out.println("Assinatura cancelada.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // Método para exibir o perfil do usuário
    private static void exibirPerfil(Perfil perfil, Scanner scanner) {
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n🔐 Perfil do usuário:");
            System.out.println("Nome: " + perfil.getNome());
            System.out.println("CPF: " + perfil.getCpf());
            System.out.println("Idade: " + perfil.getIdade());
            System.out.println("Endereço: " + perfil.getEndereco());
            System.out.println("Senha: " + perfil.getSenha());  // Exibindo a senha
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Trocar senha");
            System.out.println("2. Assinar Modo Premium");
            System.out.println("3. Sair");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    perfil.trocarSenha(scanner);
                    break;
                case "2":
                    perfil.assinarModoPremium(scanner);
                    break;
                case "3":
                    System.out.println("Saindo do perfil...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }


    // Método para exibir o menu principal do sistema
    public static void exibirMenuConsole(Perfil perfil) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n===*** MENU ***===");
            System.out.println("1. Acessar tela inicial (Home)");
            System.out.println("2. Ver status de um bairro específico");
            System.out.println("3. Acessar perfil");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    // Aqui você chamaria a função para a tela inicial, por exemplo:
                    // Home.exibirHome(scanner, perfil);
                    break;
                case "2":
                    // Aqui você chamaria a função para verificar o bairro
                    // Mapa.mostrarMenu();
                    break;
                case "3":
                    exibirPerfil(perfil, scanner);  // Chama o menu do perfil
                    break;
                case "4":
                    System.out.println("Encerrando o sistema...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
