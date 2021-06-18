package TareaAdapterElectronicos;

public class Tablets implements IElectronicosPortables {
    private int precio;
    private int tiempoVida;
    private String modelo;

    public Tablets(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio=precio;
    }

    @Override
    public void getPrecio() {
        System.out.println("El precio de la Tablet modelo: "+modelo+" es: "+precio+" Dolares");
    }

    @Override
    public void setTiempoVida(int tiempo) {
        this.tiempoVida=tiempo;
    }

    @Override
    public void getTiempoVida() {
        System.out.println("El tiempo de vida de la Tablet modelo: "+modelo+" es: "+tiempoVida+" Años");
    }
}
