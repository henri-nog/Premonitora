public class Mapa {

    public enum Bairro {
        Jardim_Atlantico("Jardim Atlântico", 24),
        Candeias("Candeias", 16),
        Iputinga("Iputinga", 14),
        Janga("Janga", 13),
        Imbiribeira("Imbiribeira", 13),
        Varzea("Várzea", 11);

        private final String nomeBairro;
        private int numDesabamento;
        private int numDesabamentos;

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

        public void incrementarDesabamento() {
            this.numDesabamentos++;
        }

        // Método utilitário para buscar bairro pelo nome digitado
        public static Bairro buscarPorNome(String nome) {
            for (Bairro b : Bairro.values()) {
                if (b.getNomeBairro().equalsIgnoreCase(nome.trim())) {
                    return b;
                }
            }
            return null; // bairro não encontrado
        }

        // Menu separado
        public static void mostrarMenu() {
            System.out.println("\nEscolha um bairro (digite o nome exatamente):");
            for (Bairro b : Bairro.values()) {
                System.out.println("- " + b.getNomeBairro());
            }
            System.out.println("- Sair");
        }
    }
}
