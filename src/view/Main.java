package view;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import perfil.Perfil;
import controller.Cadastro;
import model.Mapa;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Perfil perfil = new Perfil();

        //Cadastro
        new Cadastro(perfil);

        // Menu principal
        exibirMenuConsole(perfil);
    }
    //Método para exibir o menu principal
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
}



