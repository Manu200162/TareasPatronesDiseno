package TareaEjercicios3erParcial.ejercicio2Bridge;

public class TransferenciaBancaria implements IFormaPago{

    @Override
    public void pagar(int precio) {
        double descuento= precio*0.05;
        double precioApagar= precio-descuento;
        System.out.println("Se hace una transferencia para pagar ");
        System.out.println("Descuento: "+descuento+" Bolvianos");
        System.out.println("Precio Pagado: "+precioApagar+" Bolivianos");
        System.out.println("************************************");

    }
}
