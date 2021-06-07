package TareaChainOfRespobsability.Ejercicio3;

public interface IOrdenamiento {
    void setNext(IOrdenamiento handler);
    IOrdenamiento next();
    void realizarOrdenamiento(Persona [] personas);

}
