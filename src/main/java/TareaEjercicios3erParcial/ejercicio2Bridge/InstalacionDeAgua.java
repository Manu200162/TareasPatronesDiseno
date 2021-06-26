package TareaEjercicios3erParcial.ejercicio2Bridge;

public class InstalacionDeAgua implements IEmpresa{
    private IFormaPago formaPago;
    private String nombreEmpresa;
    private String cedeCentral;
    private int precio;

    public InstalacionDeAgua(IFormaPago formaPago){
        this.formaPago=formaPago;
        this.nombreEmpresa="EPSAS";
        this.cedeCentral="Miraflores";
        System.out.println("Se realiza la instalacion de agua");
        this.precio= 300;
    }
    @Override
    public int getPrecio(){
        return precio;
    }

    @Override
    public void informacionEmpresa() {
        System.out.println("Nombre de la empresa: "+nombreEmpresa);
        System.out.println("Locacion cede central: "+cedeCentral);
        System.out.println("Precio que cobra por instalacion: "+precio+" Bolivianos");
    }

    @Override
    public void pagar(int precio) {
        formaPago.pagar(precio);
    }
}
