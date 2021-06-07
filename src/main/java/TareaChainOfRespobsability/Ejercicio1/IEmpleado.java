package TareaChainOfRespobsability.Ejercicio1;

public interface IEmpleado {
    void setNext(IEmpleado handler); //---> saber el siguiente responsable
    IEmpleado next(); //--> ir al siguient responsable
    void realizarSolicitud(Cliente cliente);
}
