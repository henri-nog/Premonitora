import java.util.Random;

public abstract class Alarme {
    Home home = new Home();
    private int numeroDesabamentoEmSuaArea;
    public void alerta() {
        if (getNumeroDesabamentoEmSuaArea() == 0) {
            System.out.println("Atualmente, não há risco de desabamento na área. Fique tranquilo(a)");
        } else if (getNumeroDesabamentoEmSuaArea() > 10){
            System.out.println("ATENÇÃO!!! Desabamento em sua área!");
        } else {

        }
    }
    Random gerador = new Random();
    int situacao = 1 + gerador.nextInt(2);

    public int getNumeroDesabamentoEmSuaArea() {
        return numeroDesabamentoEmSuaArea;
    }

    public void setNumeroDesabamentoEmSuaArea(int situacao) {
        this.numeroDesabamentoEmSuaArea = situacao;
    }
    public void chamarSAMU() {
        System.out.println("O SAMU está a caminho");
    }

    public void chamarBombeiros() {
        System.out.println("Os bombeiros estam a caminho");
    }

    public void chamarDefesaCivil() {
        System.out.println("A Defesa Civil está a caminho");
    }
}
