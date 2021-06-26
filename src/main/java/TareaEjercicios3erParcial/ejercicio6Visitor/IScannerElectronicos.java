package TareaEjercicios3erParcial.ejercicio6Visitor;

public interface IScannerElectronicos {
    void realizarRevision(Celular celular);
    void realizarRevision(Computadora computadora);
    void realizarRevision(Televisor televisor);
}
