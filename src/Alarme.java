public class Alarme {

    public static void exibirAlerta(int numeroDesabamentos) {
        if (numeroDesabamentos == 0) {
            System.out.println("✅ Atualmente, NÃO há risco de desabamento na área. Fique tranquilo(a).");
        } else if (numeroDesabamentos < 5) {
            System.out.println("⚠️ Sua área possui risco LEVE de desabamento.");
        } else if (numeroDesabamentos > 5 && numeroDesabamentos < 10) {
            System.out.println("Sua área possui risco MÉDIO de desabamento.");
        }  else {
            System.out.println("⚠️ ATENÇÃO!!! ALTO RISCO de desabamento em sua área!");
        }
    }

    public static void chamarSAMU() {
        System.out.println("🚑 \"O SAMU está a caminho\".");
    }

    public static void chamarBombeiros() {
        System.out.println("🚒 \"Os bombeiros estão a caminho\".");
    }

    public static void chamarDefesaCivil() {
        System.out.println("🏗️ \"A Defesa Civil está a caminho\".");
    }
}
