import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    //private String nomeUsuario; //modificado
    //private String senha;
    private boolean digital; //modificado

    public Login(/*String nomeUsuario, boolean digital*/) {
        //System.out.println("\nOlá, bem-vindo(a) ao Premonitora.\n");
//                            this.nomeUsuario = nomeUsuario;
//                            senha = "1234";
                            //this.digital = digital;
        JFrame janela = new JFrame();

        JLabel labelMensagem = new JLabel("Olá, bem-vindo(a) ao Premonitora.");
        labelMensagem.setBounds(40,10,400,30);

        JLabel labelUsuario = new JLabel("Usuário: ");
        labelUsuario.setBounds(50,50,100,30);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(50,80,100,30);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(50,180,150,30);

        JLabel labelSenha = new JLabel("Senha: ");
        labelSenha.setBounds(50,150,100,30);

        JButton botaoLogar = new JButton("Login");
        botaoLogar.setBounds(50,230,150,30);
        botaoLogar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                System.out.printf("Usuário: %s\nSenha: %s", usuario, senha);
                campoUsuario.setText("");
                campoSenha.setText("");
            }
        });

        janela.add(botaoLogar);
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(campoSenha);
        janela.add(labelSenha);
        janela.add(labelMensagem);

        janela.setLayout(null);
        janela.setBounds(400, 100, 300, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    @Override
    public String toString() {
        String informacoes = String.format("Seu nome é %s e sua impressão digital consta como: %b.",
                //nomeUsuario,
                digital);
        return informacoes;
    }

//    public boolean getDigital() { //modificado
//        return digital;
//    }
//
//    public void setDigital(boolean digital) { //modificado
//        this.digital = digital;
//    }



//    public String getNomeUsuario() { //modificado
//        return nomeUsuario;
//    }
//
//    public void setNomeUsuario(String nomeUsuario) { //modificado
//        this.nomeUsuario = nomeUsuario;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
}
