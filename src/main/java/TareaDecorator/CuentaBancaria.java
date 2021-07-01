package TareaDecorator;

public class CuentaBancaria implements Component{
    private int monto;
    private String nombrePropietario;

    public CuentaBancaria (){}

    @Override
    public int getMonto() {
        return monto;
    }
    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public void operation() {
        System.out.println("Saldo disponible en la cuenta: "+monto);
        System.out.println("Nombre del propietario de la cuenta: "+nombrePropietario);
    }
}
