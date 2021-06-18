package TareaVisitor.ejercicio2;

public class Brasil implements IPais {
    private String tipoModena;
    private double cambioAdolares;

    public Brasil(){
        this.tipoModena= "Reales";
        this.cambioAdolares= 5.01;
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
