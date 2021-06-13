package TareaEjercicios2doParcial.ExtraSingleton_6;

public class Banco {
    private String nombreBanco;

    public Banco(){}

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void recibirPagoPrestamo(int cantidad, Persona persona){
        CuentaBancaria.getInstance().relaizarPagoPrestamo(cantidad,persona);
    }
}
