package TareaAdapterElectronicos;

public class Refrigeradores implements IElectrodomesticos {
    private int costo;
    private int tiempoGarantia;
    private String marca;

    public Refrigeradores(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setCosto(int costo) {
        this.costo=costo;
    }

    @Override
    public void getCosto() {
        System.out.println("El costo del refrigerador marca "+marca+" es: "+costo+" Dolares");
    }

    @Override
    public void setTiempoGarantia(int tiempo) {
        this.tiempoGarantia=tiempo;
    }

    @Override
    public void getTiempoGarantia() {
        System.out.println("El tiempo de garantia del refrigeradoror marca "+marca+" es: "+tiempoGarantia+" Años");
    }
}
