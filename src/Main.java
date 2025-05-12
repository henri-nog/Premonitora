import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       Login entrar = new Login("Fellipe",true );

        String nome = JOptionPane.showInputDialog(null, "Seu nome: ");
        String impressaoDigital = JOptionPane.showInputDialog(null, "Possui digital cadastrada: ");

        System.out.println(entrar);
    }
}


