package TareaSingletonCambioMonedas;

public class Moneda {
    String nombre;
    double valorEnDolares;
    String simbolo;

    public Moneda (){
        CambioMonedas.getInstance().info("INFO> Instanciando moneda");
    }

    public String getNombre() {
        CambioMonedas.getInstance().info("INFO> obteniendo nombre de la moneda: "+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
       CambioMonedas.getInstance().info("INFO> poniendo un nombre de moneda: "+nombre);
        this.nombre = nombre;
    }

    public double getValorEnDolares() {
       CambioMonedas.getInstance().info("INFO> obteniendo el valor en dolares "+valorEnDolares+" $ ");
        return valorEnDolares;
    }

    public void setValorEnDolares(double valorEnDolares) {
        CambioMonedas.getInstance().info("INFO> introduciendo el valor de la moneda en dolares "+valorEnDolares+" $ ");
        this.valorEnDolares = valorEnDolares;
    }

    public String getSimbolo() {
        CambioMonedas.getInstance().info("INFO> obteniendo el simbolo de la moneda "+simbolo);
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        CambioMonedas.getInstance().info("INFO> poniendo el simbolo de la moneda "+simbolo);
        this.simbolo = simbolo;
    }
}
