package TareaEjercicios2doParcial.MementoObserver_3;

public interface ICanal {
    void attach(IDesarrollador observer);
    void deattach(IDesarrollador observer);
    void notifyObserver(Codigo codigo);
}