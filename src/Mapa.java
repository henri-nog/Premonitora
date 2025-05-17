import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.Normalizer;

public class Mapa {
    private static final Map<String, Bairro> bairros = new HashMap<>();

    // Inicialização com bairros padrão
    static {
        bairros.put("Jardim Atlântico", new Bairro("Jardim Atlântico", 24));
        bairros.put("Candeias", new Bairro("Candeias", 16));
        bairros.put("Iputinga", new Bairro("Iputinga", 14));
        bairros.put("Janga", new Bairro("Janga", 13));
        bairros.put("Imbiribeira", new Bairro("Imbiribeira", 13));
        bairros.put("Várzea", new Bairro("Várzea", 11));
    }

    private static String normalizar(String texto) {
        if (texto == null) return "";
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoNormalizado = textoNormalizado.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return textoNormalizado.toLowerCase().trim();
    }

    public static Bairro buscarPorNome(String nome) {
        String nomeNormalizado = normalizar(nome);
        for (Map.Entry<String, Bairro> entry : bairros.entrySet()) {
            if (normalizar(entry.getKey()).equals(nomeNormalizado)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static void adicionarBairro(String nome, int numDesabamentos) {
        bairros.put(nome.trim(), new Bairro(nome.trim(), numDesabamentos));
    }

    public static void mostrarMenu() {
        System.out.println("\nEscolha um bairro:");
        for (Bairro bairro : bairros.values()) {
            System.out.println("- " + bairro);
        }
//        System.out.println("- Sair");
    }

    public static boolean haRiscoNaArea() {
        for (Bairro b : bairros.values()) {
            if (b.getNumDesabamentos() > 0) {
                return true;
            }
        }
        return false;
    }

    public static void executarMenu(Scanner scanner, Perfil perfil) {
        mostrarMenu();
        System.out.print("Digite o nome do bairro: ");
        String nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("sair")) return;

        Bairro bairro = buscarPorNome(nome);
        if (bairro != null) {
            perfil.setBairroAtual(bairro); // <-- isso aqui é essencial
            System.out.println("O bairro " + bairro.getNome() + " possui " + bairro.getNumDesabamentos() + " desabamentos.");
        } else {
            System.out.println("❌ Bairro não encontrado.");
        }
    }
}
