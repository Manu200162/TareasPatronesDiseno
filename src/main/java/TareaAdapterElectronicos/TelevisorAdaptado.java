package TareaAdapterElectronicos;

public class TelevisorAdaptado implements IElectronicosPortables{

    private Televisores televisor;

    public TelevisorAdaptado(Televisores televisor){
        this.televisor=televisor;
        System.out.println("Adaptacion del televisor a la primera familia de elctronicos");
    }


    @Override
    public void setPrecio(int precio) {
        this.televisor.setCosto(precio);
    }

    @Override
    public void getPrecio() {
        System.out.println("Adaptando televisor a la familia de IElectronicosPortables");
        this.televisor.getCosto();
    }

    @Override
    public void setTiempoVida(int tiempo) {
        this.televisor.setTiempoGarantia(tiempo);
    }

    @Override
    public void getTiempoVida() {
        System.out.println("Adaptando televisor a la familia de IElectronicosPortables");
        this.televisor.getTiempoGarantia();
    }
}
