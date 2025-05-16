import java.util.Scanner;

public class Home {

    public static void exibirHome(Scanner scanner, Perfil perfil) {
        boolean executando = true;

        while (executando) {
            exibirMensagemInicial(perfil);

            // Verificando se o bairroAtual é null
            Bairro bairroAtual = perfil.getBairroAtual();
            if (bairroAtual == null) {
                System.out.println("⚠️ Nenhum bairro selecionado ainda. Por favor, selecione um bairro.");
            } else {
                // Verificando o risco de desabamento
                if (bairroAtual.getNumDesabamentos() > 5) {
                    // Se o risco for médio ou alto, ofereça opções para chamar serviços
                    System.out.println("\n⚠️ Seu bairro está em RISCO! Você pode chamar serviços de emergência.");
                    System.out.println("1. Chamar SAMU");
                    System.out.println("2. Chamar Bombeiros");
                    System.out.println("3. Chamar Defesa Civil");
                    System.out.println("4. Voltar");

                    System.out.print("Escolha uma opção: ");
                    String opcaoEmergencia = scanner.nextLine();

                    switch (opcaoEmergencia) {
                        case "1":
                            Alarme.chamarSAMU();
                            break;
                        case "2":
                            Alarme.chamarBombeiros();
                            break;
                        case "3":
                            Alarme.chamarDefesaCivil();
                            break;
                        case "4":
                            System.out.println("Voltando ao menu anterior...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }
            }

            // Exibindo menu
            System.out.println("\n===*** MENU ***==="); // Menu do Home
            System.out.println("1. Ver Mapa");
            System.out.println("2. Adicionar novo registro");
            System.out.println("3. Acessar perfil");
            System.out.println("4. Voltar");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    Mapa.executarMenu(scanner, perfil); // ⚠ Aqui apenas redireciona
                    break;
                case "2":
                    Posts.adicionarPost(scanner); // ⚠ Redireciona para Posts.java
                    break;
                case "3":
                    System.out.println("🔐 Perfil do usuário (em desenvolvimento).");
                    break;
                case "4":
                    executando = false;
                    break;
                default:
                    System.out.println("⚠️ Opção inválida.");
            }
        }
    }

    private static void exibirMensagemInicial(Perfil perfil) {
        Bairro bairroAtual = perfil.getBairroAtual();

        if (bairroAtual == null) {
            System.out.println("\n✅ Atualmente, NÃO há risco de desabamento na área. Fique tranquilo(a).");
            return;
        }

        int desabamentos = bairroAtual.getNumDesabamentos();

        // No caso de risco, o método exibe a mensagem de alerta e já determina o risco
        Alarme.exibirAlerta(desabamentos);
    }
}
