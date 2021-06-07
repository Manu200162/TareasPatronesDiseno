package TareaChainOfRespobsability.Ejercicio1;

public class Support implements IEmpleado{
    private  IEmpleado next;

    @Override
    public void setNext(IEmpleado handler) {
        this.next=handler;
    }

    @Override
    public IEmpleado next() {
        return this.next;
    }

    @Override
    public void realizarSolicitud(Cliente cliente) {
        System.out.println("INFO> Los encargados de soporte resolveran la consulta de: " +cliente.getSolicitud());

    }
}
