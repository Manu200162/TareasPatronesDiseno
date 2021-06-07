package TareaChainOfRespobsability.Ejercicio2;

public class AyudaCliente implements IFuncionario {
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
        System.out.println("INFO > Servicio al cliente ayudara a: "+persona.getNombre());
    }
}