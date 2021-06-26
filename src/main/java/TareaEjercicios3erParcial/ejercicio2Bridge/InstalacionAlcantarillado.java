package TareaEjercicios3erParcial.ejercicio2Bridge;

public class InstalacionAlcantarillado implements IEmpresa{
    private IFormaPago formaPago;
    private String nombreEmpresa;
    private int numTrabajadores;
    private int precio;

    public InstalacionAlcantarillado(IFormaPago formaPago){
        this.formaPago=formaPago;
        this.nombreEmpresa="ALCANTACORP";
        this.numTrabajadores=50;
        System.out.println("Se realiza la instalacion de alcantarillado");
        this.precio= 500;
    }
    @Override
    public int getPrecio(){
        return precio;
    }

    @Override
    public void informacionEmpresa() {
        System.out.println("Nombre de la empresa: "+nombreEmpresa);
        System.out.println("Numero de trabajadores disponibles: "+numTrabajadores);
        System.out.println("Precio que cobra por instalacion: "+precio+" Bolivianos");
    }

    @Override
    public void pagar(int precio) {
        formaPago.pagar(precio);
    }
}
