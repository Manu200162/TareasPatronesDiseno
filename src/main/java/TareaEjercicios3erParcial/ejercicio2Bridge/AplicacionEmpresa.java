package TareaEjercicios3erParcial.ejercicio2Bridge;

public class AplicacionEmpresa implements IFormaPago{

    @Override
    public void pagar(int precio) {
        double descuento= precio*0.1;
        double precioApagar= precio-descuento;
        System.out.println("Se utiliza la aplicacion de la empresa para pagar ");
        System.out.println("Descuento: "+descuento+" Bolvianos");
        System.out.println("Precio Pagado: "+precioApagar+" Bolivianos");
        System.out.println("************************************");

    }
}
