package TareaEjercicios2doParcial.ChainOfResponsability_2;

public class Cabo implements IMilitar{

    private  IMilitar next;

    @Override
    public void setNext(IMilitar handler) {
        this.next=handler;
    }

    @Override
    public IMilitar next() {
        return this.next;
    }

    @Override
    public void realizarOrden(String orden) {

        if (orden.toLowerCase().contains("limpieza") ){
            System.out.println("INFO> EL Cabo atendera la siguiente orden:  "+orden);
        } else {
            System.out.println("INFO> no se cuenta con el personal para realizar la orden");
        }
    }
}
