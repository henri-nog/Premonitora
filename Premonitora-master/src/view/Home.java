package view;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import model.*;
import perfil.Perfil;
import post.Post;

import java.util.Scanner;

public class Home {

    //Tela principal após cadastro
    public static void exibirHome(Scanner scanner, Perfil perfil) {
        boolean executando = true;

        while (executando) {
            exibirMensagemInicial(perfil);

            //Verificando se o bairro atual é vazio
            Bairro bairroAtual = perfil.getBairroAtual();
            if (bairroAtual == null) {
                System.out.println("Para filtrar por seu bairro, faça \"Acessar tela inicial (Home)\" > \"Ver Mapa\" e digite o nome do bairro");
            } else {
                //Verificando o risco de desabamento
                if (bairroAtual.getNumRegistros() > 5) {
                    // Se o risco for médio ou alto, ofereça opções para chamar serviços
                    System.out.println("\nSeu bairro está em RISCO! Você pode chamar serviços de emergência.");
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
            System.out.println("\n===*** TELA INICIAL (HOME) ***==="); // Menu do view.Home
            System.out.println("1. Ver Mapa");
            System.out.println("2. Adicionar novo registro");
            System.out.println("3. Acessar perfil");
            System.out.println("4. Voltar");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    Mapa.executarMenu(scanner, perfil);
                    break;
                case "2":
                    Post.adicionarPost(scanner);
                    break;
                case "3":
                    Perfil.exibirPerfil(perfil, scanner);
                    break;
                case "4":
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    // Exibe alerta de desabamento na entrada
    private static void exibirMensagemInicial(Perfil perfil) {
        Bairro bairroAtual = perfil.getBairroAtual();

        if (bairroAtual == null) {
            System.out.println("\nAtualmente, NÃO há risco na área. Fique tranquilo(a).");
            return;
        }

        int desabamentos = bairroAtual.getNumRegistros();

        // No caso de risco, o método exibe a mensagem de alerta e já determina o risco
        Alarme.exibirAlerta(desabamentos);
    }
}
