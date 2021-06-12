package TareaeEjercicios2doParcial.ChainOfResponsability_2;

public class Teniente implements IMilitar{

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

        if (orden.toLowerCase().contains("disciplina") ){
            System.out.println("INFO> El Teniente atendera la siguiente orden:  "+orden);
        } else {
            this.next.realizarOrden(orden);
        }
    }
}
