import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando o perfil do usuário
        Scanner scanner = new Scanner(System.in);
        Perfil perfil = new Perfil();
        Cadastro login = new Cadastro(perfil);

        // Dados do usuário
//        System.out.println("=== Bem-vindo(a) ao PreMonitora ===");
//        System.out.print("Digite o seu nome: ");
//        perfil.setNome(scanner.nextLine());
//        System.out.print("Digite o seu CPF: ");
//        perfil.setCpf(scanner.nextLine());
//        System.out.print("Digite a sua idade: ");
//        perfil.setIdade(Integer.parseInt(scanner.nextLine()));
//        System.out.print("Digite o seu endereço: ");
//        perfil.setEndereco(scanner.nextLine());
//        System.out.print("Digite a sua senha: ");
//        perfil.setSenha(scanner.nextLine());  // Agora a senha é registrada!
//
//        System.out.println("Cadastro realizado com sucesso!");

        // Menu principal
        exibirMenuConsole(perfil);
    }

    // Método para exibir o menu principal
    public static void exibirMenuConsole(Perfil perfil) {
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
                    // Aqui você chamaria a função para a tela inicial, por exemplo:
                     Home.exibirHome(scanner, perfil);
                    break;
                case "2":
                    Mapa.mostrarMenu();
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

    // Método para exibir o perfil do usuário
//    public static void exibirPerfil(Perfil perfil, Scanner scanner) {
//        boolean rodando = true;
//
//        while (rodando) {
////            System.out.println("\nPerfil do usuário:");
////            System.out.println("Nome: " + perfil.getNome());
////            System.out.println("CPF: " + perfil.getCpf());
////            System.out.println("Idade: " + perfil.getIdade());
////            System.out.println("Endereço: " + perfil.getEndereco());
////            System.out.println("Senha: " + perfil.getSenha());
//            System.out.println("\nEscolha uma opção:");
//            System.out.println("\n1. Trocar senha");
//            System.out.println("2. Assinar Modo Premium");
//            System.out.println("3. Sair");
//
//            String opcao = scanner.nextLine();
//
//            switch (opcao) {
//                case "1":
//                    perfil.trocarSenha(scanner);
//                    break;
//                case "2":
//                    perfil.assinarModoPremium(scanner);
//                    break;
//                case "3":
//                    System.out.println("Saindo do perfil...");
//                    rodando = false;
//                    break;
//                default:
//                    System.out.println("Opção inválida.");
//            }
//        }
    }

