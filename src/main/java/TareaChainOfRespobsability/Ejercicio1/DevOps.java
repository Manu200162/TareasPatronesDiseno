package TareaChainOfRespobsability.Ejercicio1;

public class DevOps implements IEmpleado{
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
        if(cliente.getSolicitud().startsWith("infraestructura")){
            System.out.println("INFO> El DevOps necesita informacion del error para poder  " +
                    "resolver la siguiente consulta: "+cliente.getSolicitud());
        }else{
            this.next.realizarSolicitud(cliente);
        }
    }
}
