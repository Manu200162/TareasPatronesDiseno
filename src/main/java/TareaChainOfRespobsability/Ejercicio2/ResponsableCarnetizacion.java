package TareaChainOfRespobsability.Ejercicio2;

import TareaChainOfRespobsability.Ejercicio2.IFuncionario;
import TareaChainOfRespobsability.Ejercicio2.Persona;

public class ResponsableCarnetizacion implements IFuncionario {
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
        if(persona.isCertificadoNacimiento() && persona.isPagoBancario() && persona.isFicha()){
            System.out.println("INFO > El responsable de carnetizacion atiende a: "+persona.getNombre());
        }else{
            this.next.realizarCarnetizacion(persona);
        }
    }
}
