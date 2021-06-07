package TareaChainOfRespobsability.Ejercicio1;

public class RealizadorConsultas implements IEmpleado{
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
        DevOps devOps = new DevOps();
        this.setNext(devOps);

        QA qa =new QA();
        devOps.setNext(qa);

        Developer developer = new Developer();
        qa.setNext(developer);

        Finanzas finanzas = new Finanzas();
        developer.setNext(finanzas);

        Support support = new Support();
        finanzas.setNext(support);

        this.next.realizarSolicitud(cliente);

    }
}
