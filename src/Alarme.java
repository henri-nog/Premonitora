public abstract class Alarme {
    private boolean aviso;
    private boolean som;

    public void alerta() {
        if (aviso == true || som == true) {
            System.out.println("ATENÇÃO!!! Desabamento em sua área!");
        }
    }
}
