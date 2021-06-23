package TareaBridge.ejercicio2;

public class Paquete {
    //precio, nombre del paquete
    private String nomprePaquete;
    private int    precio;

    public Paquete(){}
    public Paquete(String nomprePaquete, int precio) {
        this.nomprePaquete = nomprePaquete;
        this.precio = precio;
    }

    public String getNomprePaquete() {
        return nomprePaquete;
    }

    public void setNomprePaquete(String nomprePaquete) {
        this.nomprePaquete = nomprePaquete;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
