package TareaPrototypeCelulares;

public class SIM {
     private String nombreComaniaCelular;
     private int numeroCelular;

     public SIM ( String nombreCompaniaCelular, int numeroCelular){
     this.nombreComaniaCelular=nombreCompaniaCelular;
     this.numeroCelular=numeroCelular;
    }

    public String getNombreComaniaCelular() {
        return nombreComaniaCelular;
    }

    public void setNombreComaniaCelular(String nombreComaniaCelular) {
        this.nombreComaniaCelular = nombreComaniaCelular;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
