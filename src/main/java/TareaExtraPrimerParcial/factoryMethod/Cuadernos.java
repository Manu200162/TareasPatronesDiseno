package TareaExtraPrimerParcial.factoryMethod;

public class Cuadernos {
    //cuadernos(tipo, #hojas)
    private String tipo;
    private int numeroHojas;

    public Cuadernos(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public void showInfo(){
        System.out.println("Cuaderno tipo: "+tipo);
        System.out.println("Cuaderno numero de hojas: "+numeroHojas);
    }
}
