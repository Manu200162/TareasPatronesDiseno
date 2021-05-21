package TareaFactoryMethodAerolinea;

public class Avion {
    //avion (marca,capacidad, modelo, numerodeAsientos)
    private String marca;
    private int    capacidad;
    private String modelo;
    private int    numeroPasajeros;

    public Avion(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public void showInfo(){
        System.out.println("avion marca: "+marca);
        System.out.println("avion capacidad: "+capacidad);
        System.out.println("avion modelo: "+modelo);
        System.out.println("avion numero de pasajeros: "+numeroPasajeros);
    }
}
