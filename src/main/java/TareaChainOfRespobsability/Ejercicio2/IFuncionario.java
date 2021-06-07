package TareaChainOfRespobsability.Ejercicio2;

public interface IFuncionario {
    void setNext(IFuncionario handler);
    IFuncionario next();
    void realizarCarnetizacion(Persona persona);

}