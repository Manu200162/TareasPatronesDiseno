package TareaProxyBanco;

public class CuentaBancaria {
    private String numCuenta;
    private String nombrePropietario;
    private double saldo;


    public CuentaBancaria(String numCuenta, String nombrePropietario, int saldo) {
        this.numCuenta = numCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void showInfo(){
        System.out.println("Saldo disponible: "+saldo+" Bolivianos");
        System.out.println("Nombre del dueño de la cuenta: "+nombrePropietario);

    }
}
