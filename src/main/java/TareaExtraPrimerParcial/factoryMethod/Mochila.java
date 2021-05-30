package TareaExtraPrimerParcial.factoryMethod;

public class Mochila {
    private int numeroBolsillos;
    private String tamanio;


    public Mochila(){}

    public int getTamanioBolsillos() {
        return numeroBolsillos;
    }

    public void setNumeroBolsillos(int tamanioBolsillos) {
        this.numeroBolsillos = tamanioBolsillos;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public void showInfo(){
        System.out.println("Mochila numero de bolsillos: "+numeroBolsillos);
        System.out.println("Mochila tamaño: "+tamanio);
    }
}
