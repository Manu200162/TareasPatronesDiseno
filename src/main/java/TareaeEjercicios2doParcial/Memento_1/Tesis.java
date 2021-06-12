package TareaeEjercicios2doParcial.Memento_1;

public class Tesis {

    private String  partesCompletas;
    private int     partesAceptadas;
    private boolean correccionAplicada;


    public Tesis(String partesCompletas, int fechaDeEntrega, boolean correccionAplicada) {
        this.partesCompletas = partesCompletas;
        this.partesAceptadas = fechaDeEntrega;
        this.correccionAplicada = correccionAplicada;
    }

    public String getPartesCompletas() {
        return partesCompletas;
    }

    public void setPartesCompletas(String partesCompletas) {
        this.partesCompletas = partesCompletas;
    }

    public int getFechaDeEntrega() {
        return partesAceptadas;
    }

    public void setFechaDeEntrega(int fechaDeEntrega) {
        this.partesAceptadas = fechaDeEntrega;
    }

    public boolean isCorreccionAplicada() {
        return correccionAplicada;
    }

    public void setCorreccionAplicada(boolean correccionAplicada) {
        this.correccionAplicada = correccionAplicada;
    }

    public void showInfo(){
        System.out.println("Partes completas: "+partesCompletas);
        System.out.println("Fecha de entrega: "+partesAceptadas);
        System.out.println("Partes corregidas: "+correccionAplicada);
    }
}
