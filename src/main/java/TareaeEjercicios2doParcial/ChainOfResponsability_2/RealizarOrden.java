package TareaeEjercicios2doParcial.ChainOfResponsability_2;

public class RealizarOrden  implements  IMilitar{
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
        General general = new General();
        setNext(general);

        Teniente teniente = new Teniente();
        general.setNext(teniente);

        Coronel coronel = new Coronel();
        teniente.setNext(coronel);

        Cabo cabo = new Cabo();
        coronel.setNext(cabo);

        next.realizarOrden(orden);
    }
}
