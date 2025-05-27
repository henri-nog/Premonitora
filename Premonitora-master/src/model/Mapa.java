package model;

/**
 * Classe responsável por gerenciar o mapeamento dos bairros e suas informações,
 * como número de desabamentos e seleção pelo usuário.
 *
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.Normalizer;

public class Mapa {

    // Mapa que armazena os bairros cadastrados, com o nome como chave
    private static final Map<String, Bairro> bairros = new HashMap<>();

    // Bloco estático para adicionar bairros padrão ao sistema
    static {
        bairros.put("Jardim Atlântico", new Bairro("Jardim Atlântico", 24));
        bairros.put("Candeias", new Bairro("Candeias", 16));
        bairros.put("Iputinga", new Bairro("Iputinga", 14));
        bairros.put("Janga", new Bairro("Janga", 13));
        bairros.put("Imbiribeira", new Bairro("Imbiribeira", 13));
        bairros.put("Várzea", new Bairro("Várzea", 11));
    }

    /**
     * Normaliza um texto, removendo acentuação e convertendo para minúsculas.
     * @param texto Texto original.
     * @return Texto normalizado.
     */
    private static String normalizar(String texto) {
        if (texto == null) return "";
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoNormalizado = textoNormalizado.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return textoNormalizado.toLowerCase().trim();
    }

    /**
     * Busca um bairro pelo nome informado, utilizando normalização para comparação.
     * @param nome Nome do bairro a ser buscado.
     * @return Bairro correspondente, ou null se não encontrado.
     */
    public static Bairro buscarPorNome(String nome) {
        String nomeNormalizado = normalizar(nome);
        for (Map.Entry<String, Bairro> entry : bairros.entrySet()) {
            if (normalizar(entry.getKey()).equals(nomeNormalizado)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /**
     * Adiciona um novo bairro ao mapa com a quantidade de desabamentos.
     * @param nome Nome do bairro.
     * @param numDesabamentos Número de desabamentos registrados.
     */
    public static void adicionarBairro(String nome, int numDesabamentos) {
        bairros.put(nome.trim(), new Bairro(nome.trim(), numDesabamentos));
    }

    /**
     * Exibe no console a lista de bairros disponíveis.
     */
    public static void mostrarMenu() {
        System.out.println("\nEscolha um bairro:");
        for (Bairro bairro : bairros.values()) {
            System.out.println("- " + bairro);
        }
    }

    /**
     * Executa o menu de seleção de bairro e atualiza o bairro atual do perfil.
     * @param scanner Scanner para entrada do usuário.
     * @param perfil Perfil do usuário que está selecionando o bairro.
     */
    public static void executarMenu(Scanner scanner, Perfil perfil) {
        mostrarMenu();
        System.out.print("Digite o nome do bairro: ");
        String nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("sair")) return;

        Bairro bairro = buscarPorNome(nome);
        if (bairro != null) {
            perfil.setBairroAtual(bairro);
            System.out.println("O bairro " + bairro.getNome() + " possui " + bairro.getNumDesabamentos() + " desabamentos.");
        } else {
            System.out.println("Bairro não encontrado.");
        }
    }
}
