package TareaChainOfRespobsability.Ejercicio1;

public class Developer implements IEmpleado{
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
        if(cliente.getSolicitud().startsWith("nueva funcionalidad")){
            System.out.println("INFO> El Developer estima la nueva funcionalidad " +
                    "para la solicitud"+cliente.getSolicitud());
        }else{
            this.next.realizarSolicitud(cliente);
        }
    }
}
