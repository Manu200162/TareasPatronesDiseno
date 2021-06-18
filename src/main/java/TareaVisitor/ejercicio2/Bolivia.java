package TareaVisitor.ejercicio2;

public class Bolivia implements IPais {
    private String tipoModena;
    private double cambioAdolares;

    public Bolivia(){
        this.tipoModena= "Bolivianos";
        this.cambioAdolares= 6.97;
    }

    public String getTipoModena() {
        return tipoModena;
    }

    public double getCambioAdolares() {
        return cambioAdolares;
    }



    @Override
    public void accept(IVisitante libreCambista, Boolean cambioADolares, int monto) {
        libreCambista.visit(this,cambioADolares,monto);
    }
}
