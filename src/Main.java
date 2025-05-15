import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada;

        while (true) {
            Mapa.Bairro.mostrarMenu();
            System.out.print("Digite o nome do bairro: ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            Mapa.Bairro bairroEscolhido = Mapa.Bairro.buscarPorNome(entrada);

            if (bairroEscolhido != null) {
                System.out.println("O bairro digitado, " + bairroEscolhido.getNomeBairro()
                        + ", possui " + bairroEscolhido.getNumDesabamento() + " desabamentos.");
            } else {
                System.out.println("O bairro informado não possui registro de desabamentos em nosso sistema.");
            }
        }

        scanner.close();
    }
}
