package TareaAdapterElectronicos;

public class RefrigeradorAdaptado implements IElectronicosPortables{

    private Refrigeradores refrigerador;

    public RefrigeradorAdaptado(Refrigeradores refrigerador){
        this.refrigerador=refrigerador;
        System.out.println("Adaptacion del refrigerador a la primera familia de elctronicos");
    }


    @Override
    public void setPrecio(int precio) {
        this.refrigerador.setCosto(precio);
    }

    @Override
    public void getPrecio() {
        System.out.println("Adaptando refrigerador a la familia de IElectronicosPortables");
        this.refrigerador.getCosto();
    }

    @Override
    public void setTiempoVida(int tiempo) {
        this.refrigerador.setTiempoGarantia(tiempo);
    }

    @Override
    public void getTiempoVida() {
        System.out.println("Adaptando refrigerador a la familia de IElectronicosPortables");
        this.refrigerador.getTiempoGarantia();
    }
}
