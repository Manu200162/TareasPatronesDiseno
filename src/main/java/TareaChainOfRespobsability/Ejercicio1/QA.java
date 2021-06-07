package TareaChainOfRespobsability.Ejercicio1;

public class QA implements IEmpleado{
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
        if(cliente.getSolicitud().startsWith("Bug") ||cliente.getSolicitud().startsWith("Mejora")){
            System.out.println("INFO> El QA resolvera la siguiente consulta: "+cliente.getSolicitud());
        }else{
            this.next.realizarSolicitud(cliente);
        }
    }
}
