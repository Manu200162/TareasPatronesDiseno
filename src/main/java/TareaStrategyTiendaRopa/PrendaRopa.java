package TareaStrategyTiendaRopa;

public class PrendaRopa {
    private String tipo;
    private int    precio;
    private String talla;

    public PrendaRopa(String tipo, int precio, String talla) {
        this.tipo = tipo;
        this.precio = precio;
        this.talla = talla;
    }

    public void showInfo(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Precio: "+precio);
        System.out.println("Talla: "+talla);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
