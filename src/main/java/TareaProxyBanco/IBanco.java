package TareaProxyBanco;

public interface IBanco {
    void realizarRetiro(CuentaBancaria cuentaBancaria, double cantRetiro, String moneda);
}
