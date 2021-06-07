package TareaChainOfRespobsability.Ejercicio2;

public class Notario implements IFuncionario {
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
        if(persona.isPagoBancario() && persona.isFicha()){
            System.out.println("INFO > El notario creara un certificado  de nacimiento para: "+persona.getNombre());
            persona.setCertificadoNacimiento(true);
        }else{
            this.next.realizarCarnetizacion(persona);
        }
    }
}