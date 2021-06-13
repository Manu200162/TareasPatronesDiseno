package TareaEjercicios2doParcial.ChainOfResponsability_2;

public class General implements IMilitar{

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

        if (orden.toLowerCase().contains("entrevistas") ){
            System.out.println("INFO> EL General atendera la siguiente orden:  "+orden);
        } else {
            this.next.realizarOrden(orden);
        }
    }
}
