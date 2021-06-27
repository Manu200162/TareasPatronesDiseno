package TareaEjercicios3erParcial.ejercicio7Extra;

public class Customer {
    private String nombre;
    private String ci;

    public Customer(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public void solicitarServicioTecnico(IComputadora computadora){
        Reparador reparador = new Reparador();
        computadora.recibirReparacion(reparador);
    }

    public void pagarPorElServicio(int monto){
        CuentaBancaria.getInstance().recibirPago(monto,nombre);
    }
}
