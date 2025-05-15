import java.util.Random;

public class Home {
    private String statusPredio;

    public Home() {
        System.out.println("As chances de um desabamento são " + statusPredio + " de por cento");
    }
    public String getStatusPredio() {
        return statusPredio;
    }
    public void setStatusPredio(String statusPredio) {
        this.statusPredio = statusPredio;
    }
    public int calculaChanceDesabamento() {
        Random gerador = new Random();
        int porcentagemDesabamento = 1 + gerador.nextInt(100);
        return porcentagemDesabamento;
    }
}
