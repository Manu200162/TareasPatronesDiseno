package TareaEjercicios3erParcial.ejercicio2Bridge;

public class InstalacionElectrica implements IEmpresa{
    private IFormaPago formaPago;
    private String nombreEmpresa;
    private String tiempoEnServicio;
    private int precio;

    public InstalacionElectrica(IFormaPago formaPago){
        this.formaPago=formaPago;
        this.nombreEmpresa="ELECTROPAZ";
        this.tiempoEnServicio="10 años al servicio";
        System.out.println("Se realiza la instalacion electrica");
        this.precio= 2000;
    }
    @Override
    public int getPrecio(){
        return precio;
    }

    @Override
    public void informacionEmpresa() {
        System.out.println("Nombre de la empresa: "+nombreEmpresa);
        System.out.println("Años al servicio: "+tiempoEnServicio);
        System.out.println("Precio que cobra por instalacion: "+precio+" Bolivianos");
    }

    @Override
    public void pagar(int precio) {
        formaPago.pagar(precio);
    }
}
