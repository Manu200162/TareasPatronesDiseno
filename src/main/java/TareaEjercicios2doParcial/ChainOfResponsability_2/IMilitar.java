package TareaEjercicios2doParcial.ChainOfResponsability_2;


public interface IMilitar {
    void setNext(IMilitar handler);
   IMilitar next();
    void realizarOrden(String orden);

}
