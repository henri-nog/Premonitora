package model;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

public class Alarme {
    // Exibe mensagem de alerta com base no número de desabamentos
    public static void exibirAlerta(int numeroRegistros) {
        if (numeroRegistros == 0) {
            System.out.println("Atualmente, NÃO há risco na área. Fique tranquilo(a).");
        } else if (numeroRegistros < 5) {
            System.out.println("Sua área possui risco LEVE.");
        } else if (numeroRegistros > 5 && numeroRegistros < 10) {
            System.out.println("Sua área possui risco MÉDIO.");
        }  else {
            System.out.println("ATENÇÃO!!! ALTO RISCO em sua área!");
        }
    }
    // Simula chamada de emergência
    public static void chamarSAMU() {
        System.out.println("\n\"O SAMU está a caminho\".");
    }
    public static void chamarBombeiros() {
        System.out.println("\n\"Os Bombeiros estão a caminho\".");
    }
    public static void chamarDefesaCivil() {
        System.out.println("\n\"A Defesa Civil está a caminho\".");
    }
}
