package TareaAdapterElectronicos;

public class LavadoraAdaptada implements IElectronicosPortables{

    private Lavadoras lavadora;

    public LavadoraAdaptada(Lavadoras lavadora){
        this.lavadora=lavadora;
        System.out.println("Adaptacion de la lavadora a la primera familia de elctronicos");
    }


    @Override
    public void setPrecio(int precio) {
        this.lavadora.setCosto(precio);
    }

    @Override
    public void getPrecio() {
        System.out.println("Adaptando lavadora a la familia de IElectronicosPortables");
        this.lavadora.getCosto();
    }

    @Override
    public void setTiempoVida(int tiempo) {
        this.lavadora.setTiempoGarantia(tiempo);
    }

    @Override
    public void getTiempoVida() {
        System.out.println("Adaptando lavadora a la familia de IElectronicosPortables");
        this.lavadora.getTiempoGarantia();
    }
}
