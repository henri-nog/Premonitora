package model;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import java.util.Scanner;

public class Cadastro {
    // Construtor que realiza o cadastro do usuário
    public Cadastro(Perfil perfil) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo(a) ao PreMonitora ===");

        // Coleta de dados do usuário
        System.out.print("Digite o seu nome: ");
        perfil.setNome(scanner.nextLine());

        System.out.print("Digite o seu CPF: ");
        perfil.setCpf(scanner.nextLine());

        System.out.print("Digite a sua idade: ");
        while (true) {
            try {
                perfil.setIdade(Integer.parseInt(scanner.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira uma idade válida: ");
            }
        }

        System.out.print("Digite o seu endereço: ");
        perfil.setEndereco(scanner.nextLine());

        // Coleta da senha
        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextLine();
        perfil.setSenha(senha);

        System.out.println("Cadastro realizado com sucesso!");
    }
}
