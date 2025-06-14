package perfil;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import model.Bairro;
import model.Usuario;

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
        System.out.println("\"Premium Vigilante R$ só R$ 4,99/mês\"");
        System.out.println("1. Assinar Modo Premium");
        System.out.println("2. Cancelar Modo Premium");

        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            System.out.println("Você assinou o Modo Premium!");
            System.out.println("Em pouco tempo não será mais preciso ver ficar vendo nenhum anúncio!");
            System.out.println("* Requisitar uma análise técnica de um engenheiro civil");
            System.out.println("* Benefício \"Amigo Vigilante\": onde é possível cadastrar uma pessoa para acompanhá-lo");
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
            System.out.println("2. Assinar/Cancelar \"Modo Premium\"");
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
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
