package post;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import model.Bairro;
import model.Mapa;

import java.util.Scanner;

public class Post {

    public static void adicionarPost(Scanner scanner) {
        System.out.print("Digite o NOME DO BAIRRO para fazer o registro: ");
        String nome = scanner.nextLine();

        Bairro bairro = Mapa.buscarPorNome(nome);

        if (bairro != null) {
            registrarDesabamento(scanner, bairro);
        } else {
            System.out.println("Bairro não encontrado. Deseja cadastrá-lo? (sim ou não)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Quantos POSTS você deseja registrar: ");
                String numeroStr = scanner.nextLine();
                try {
                    int quantidade = Integer.parseInt(numeroStr);
                    if (quantidade < 0) {
                        System.out.println("Número inválido.");
                        return;
                    }

                    Mapa.adicionarBairro(nome, quantidade);
                    System.out.println("\nBairro adicionado com sucesso.");
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida.");
                }
            } else {
                System.out.println("Bairro não registrado.");
            }
        }
    }

    private static void registrarDesabamento(Scanner scanner, Bairro bairro) {
        System.out.print("Digite o NÚMERO DE DESABAMENTOS para registrar no sistema: ");
        String numeroStr = scanner.nextLine();

        try {
            int quantidade = Integer.parseInt(numeroStr);
            if (quantidade <= 0) {
                System.out.println("O número deve ser maior que zero.");
                return;
            }

            bairro.incrementarRegistro(quantidade);
            System.out.println(quantidade + " número de registro(s) para o bairro " + bairro.getNome());

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número.");
        }
    }
}
