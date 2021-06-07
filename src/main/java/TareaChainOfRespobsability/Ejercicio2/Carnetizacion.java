package TareaChainOfRespobsability.Ejercicio2;

public class Carnetizacion implements IFuncionario {
    private IFuncionario next;


    @Override
    public void setNext(IFuncionario handler) {
        this.next=handler;
    }

    @Override
    public IFuncionario next() {
        return this.next;
    }

    @Override
    public void realizarCarnetizacion(Persona persona) {
            ResponsableCarnetizacion responsable = new ResponsableCarnetizacion();
            this.setNext(responsable);

            Notario notario = new Notario();
            responsable.setNext(notario);

            Cajero cajero = new Cajero();
            notario.setNext(cajero);

            AyudaCliente ayudaCliente = new AyudaCliente();
            cajero.setNext(ayudaCliente);

            this.next.realizarCarnetizacion(persona);
    }
}
