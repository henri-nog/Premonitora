public class Mapa {
    //private String[] locais;

    public enum Bairro {
        Jardim_Atlantico("Jardim Atlântico",24),

        Candeias("Candeias",16),

        Iputinga("Iputinga",14),

        Janga("Janga",13),

        Imbiribeira("Imbiribeira",13),

        Varzea("Várzea",11);


        private final String nomeBairro;
        private int numDesabamento;
        private String menu;

        Bairro(String nomeBairro, int numDesabamento) {
            this.nomeBairro = nomeBairro;
            this.numDesabamento = numDesabamento;
        }

        public String getNomeBairro() {
            return nomeBairro;
        }

        public int getNumDesabamento() {
            return numDesabamento;
        }

        public void menu() {
            System.out.println("Escolha um bairro");
            System.out.println("1 - Jardim Atlântico");
            System.out.println("2 - Candeias");
            System.out.println("3 - Iputinga");
            System.out.println("4 - Janga");
            System.out.println("5 - Imbiribeira");
            System.out.println("6 - Várzea");
            System.out.println("7 - Sair");
        }
    }
}






