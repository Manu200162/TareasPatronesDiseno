package TareaChainOfRespobsability.Ejercicio2;

public class Cajero implements IFuncionario {
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
        if(persona.isCertificadoNacimiento()&& persona.isFicha()){
            System.out.println("INFO > El cajero recibira el pago de: "+persona.getNombre());
            persona.setPagoBancario(true);
        }else{
            this.next.realizarCarnetizacion(persona);
        }
    }
}
