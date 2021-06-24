package TareaProxyBanco;

public class ServicioBancario implements IBanco {

    private String nombreBanco;
    private String sucursal;

    public ServicioBancario(String nombreBanco, String sucursal){
        this.nombreBanco=nombreBanco;
        this.sucursal=sucursal;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public void realizarRetiro(CuentaBancaria cuentaBancaria, double cantRetiro, String moneda) {
        double saldoReducido= cuentaBancaria.getSaldo()-cantRetiro;
        cuentaBancaria.setSaldo(saldoReducido);
        System.out.println("Informacion de la cuenta luego del retiro: ");
        cuentaBancaria.showInfo();
    }
}
