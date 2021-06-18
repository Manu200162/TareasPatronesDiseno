package TareaVisitor.ejercicio2;

public class Italia implements IPais {
    private String tipoModena;
    private double cambioAdolares;

    public Italia(){
        this.tipoModena= "Euros";
        this.cambioAdolares= 0.84;
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
