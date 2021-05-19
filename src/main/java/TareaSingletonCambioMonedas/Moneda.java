package TareaSingletonCambioMonedas;

public class Moneda {
    String nombre;
    double valorEnDolares;
    String simbolo;

    public Moneda (){
        CambioMonedas.getInstance().info("INFO> Instanciando moneda");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorEnDolares() {
        return valorEnDolares;
    }

    public void setValorEnDolares(double valorEnDolares) {
        this.valorEnDolares = valorEnDolares;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
