package TareaDecorator;

public class Client {
    public static void main(String[] args){
        Component cuentaBancaria= new CuentaBancaria();
        cuentaBancaria.setMonto(5000);
        ((CuentaBancaria)cuentaBancaria).setNombrePropietario("Juan Perez");


        cuentaBancaria= new BancaPorInternet(cuentaBancaria,true);
        cuentaBancaria= new Seguro(cuentaBancaria,"Bajo");
        cuentaBancaria= new Promocion(cuentaBancaria);
        cuentaBancaria.operation();

    }
}
