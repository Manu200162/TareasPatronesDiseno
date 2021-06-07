package TareaChainOfRespobsability.Ejercicio1;

public class Finanzas implements IEmpleado{
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
        if(cliente.getSolicitud().startsWith("costos")){
            System.out.println("INFO> El encargado de finanzas resolvera la consulta de  " +cliente.getSolicitud());
        }else{
            this.next.realizarSolicitud(cliente);
        }
    }
}
