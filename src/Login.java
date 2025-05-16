import java.util.Scanner;

public class Login {

    // Construtor Login agora recebe o objeto Perfil
    public Login(Perfil perfil) {
        // Criar o scanner para capturar os dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados do usuário no console
        System.out.println("=== Bem-vindo(a) ao PreMonitora ===");

        // Captura o nome do usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Captura o CPF
        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        // Captura a idade
        System.out.print("Digite a sua idade: ");
        int idade = 0;
        while (true) {
            try {
                idade = Integer.parseInt(scanner.nextLine());
                break;  // Sai do loop se a idade for válida
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira uma idade válida: ");
            }
        }

        // Captura o endereço
        System.out.print("Digite o seu endereço: ");
        String endereco = scanner.nextLine();

        // Agora associamos as informações ao perfil
        perfil.setNome(nome);
        perfil.setCpf(cpf);
        perfil.setIdade(idade);
        perfil.setEndereco(endereco);

        // Exibe mensagem de sucesso
        System.out.println("Cadastro realizado com sucesso!");

        // Após o cadastro, chama o menu de opções
        exibirMenuConsole(perfil);
    }

    // Método para exibir o menu no console após o login
    private void exibirMenuConsole(Perfil perfil) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n===*** MENU ***===");
            System.out.println("1. Acessar tela inicial (Home)");
            System.out.println("2. Ver status de um bairro específico");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    Home.exibirHome(scanner, perfil);
                    break;
                case "2":
                    Mapa.mostrarMenu();
                    System.out.print("Digite o nome do bairro: ");
                    String entrada = scanner.nextLine();
                    if (entrada.equalsIgnoreCase("sair")) {
                        break;
                    }
                    Bairro bairroEscolhido = Mapa.buscarPorNome(entrada);
                    if (bairroEscolhido != null) {
                        perfil.setBairroAtual(bairroEscolhido);
                        System.out.println("O bairro digitado, " + bairroEscolhido.getNome()
                                + ", possui " + bairroEscolhido.getNumDesabamentos() + " desabamentos.");
                    } else {
                        System.out.println("O bairro informado não possui registro de desabamentos em nosso sistema.");
                    }
                    break;
                case "3":
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
