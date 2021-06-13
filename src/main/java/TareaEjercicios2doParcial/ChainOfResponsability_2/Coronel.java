package TareaEjercicios2doParcial.ChainOfResponsability_2;

public class Coronel implements IMilitar{

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
        if (orden.toLowerCase().contains("desbloqueo")  || orden.toLowerCase().contains("manifestacion")){
            System.out.println("INFO> El Coronel atendera la siguiente orden:  "+orden);
        } else {
            this.next.realizarOrden(orden);
        }
    }
}
