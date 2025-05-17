import java.util.Scanner;

public class Login {

    public Login(Perfil perfil) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo(a) ao PreMonitora ===");

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
        perfil.setSenha(senha);  // Supondo que você tenha um método setSenha na classe Perfil.

        System.out.println("Cadastro realizado com sucesso!");
    }
}
