package TareaVisitor.ejercicio2;

public class Argentina implements IPais {
    private String tipoModena;
    private double cambioAdolares;

    public Argentina(){
        this.tipoModena= "Pesos Argentinos";
        this.cambioAdolares= 95.35;
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
