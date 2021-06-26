package TareaEjercicios3erParcial.ejercicio2Bridge;

public class TigoMoney implements IFormaPago{

    @Override
    public void pagar(int precio) {
        double descuento= precio*0.02;
        double precioApagar= precio-descuento;
        System.out.println("Se paga mediante Tigo Money para pagar ");
        System.out.println("Descuento: "+descuento+" Bolvianos");
        System.out.println("Precio Pagado: "+precioApagar+" Bolivianos");
        System.out.println("************************************");

    }
}
