package TareaVisitor.ejercicio2;

public interface IVisitante {
    void visit(Bolivia bolivia,Boolean cambioADolares,int monto);
    void visit(Argentina argentina,Boolean cambioADolares,int monto);
    void visit(Brasil brasil,Boolean cambioADolares,int monto);
    void visit(Italia italia,Boolean cambioADolares,int monto);
    void hacerCambioMoneda(Boolean cambioADolares,IPais pais,int monto);
}
