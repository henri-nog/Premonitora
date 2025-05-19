package model;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import java.util.Scanner;

public class Perfil extends Usuario {

    private Bairro bairroAtual;

    public Bairro getBairroAtual() {
        return bairroAtual;
    }

    public void setBairroAtual(Bairro bairroAtual) {
        this.bairroAtual = bairroAtual;
    }

    public void trocarSenha(Scanner scanner) {
        System.out.print("Digite a senha atual: ");
        String senhaAtual = scanner.nextLine();

        System.out.print("Digite a nova senha: ");
        String novaSenha = scanner.nextLine();

        super.trocarSenha(senhaAtual, novaSenha);
    }

    public void assinarModoPremium(Scanner scanner) {
        System.out.println("\nDeseja assinar o Modo Premium?");
        System.out.println("\"Premium Vigilante R$ 0 por 1 mês. Depois é só R$ 11,90/mês\"");
        System.out.println("1. Assinar Modo Premium");
        System.out.println("2. Cancelar Modo Premium");

        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            System.out.println("Você assinou o Modo Premium! Já, já não será preciso ver ficar vendo nenhum anúncio!");
        } else if (escolha.equals("2")) {
            System.out.println("Assinatura cancelada.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void exibirPerfil(Perfil perfil, Scanner scanner) {
        boolean rodando = true;

        while (rodando) {
            System.out.println("\nPerfil do usuário");
            System.out.println("Nome: " + perfil.getNome());
            System.out.println("CPF: " + perfil.getCpf());
            System.out.println("Idade: " + perfil.getIdade());
            System.out.println("Endereço: " + perfil.getEndereco());
            System.out.println("Senha: " + perfil.getSenha());
            System.out.println("\n1. Trocar senha");
            System.out.println("2. Assinar Modo Premium");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

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
}
