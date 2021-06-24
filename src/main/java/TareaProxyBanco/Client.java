package TareaProxyBanco;

public class Client {
    public static void main(String[] args){

        CuentaBancaria cuenta1= new CuentaBancaria("4545SFE","Jose Perez",500);

        TarjetaDebito tarjetaDebito= new TarjetaDebito("Bisa");
        tarjetaDebito.realizarRetiro(cuenta1,200,"Bolivianos");
        tarjetaDebito.realizarRetiro(cuenta1,400,"Bolivianos");
        tarjetaDebito.realizarRetiro(cuenta1,20,"Dolares");
    }
}
