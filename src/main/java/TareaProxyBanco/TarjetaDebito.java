package TareaProxyBanco;

public class TarjetaDebito implements IBanco{
    private ServicioBancario servicioBancario;

    public TarjetaDebito(String nombreBanco){
        this.servicioBancario= new ServicioBancario(nombreBanco,"LA PAZ");
        System.out.println("****************Iniciando el uso de la tarjeta********");
        System.out.println("Tarjeta del banco: "+nombreBanco);
    }

    @Override
    public void realizarRetiro(CuentaBancaria cuentaBancaria, double cantRetiro, String moneda) {
        double conversion= cantRetiro;
        if(!moneda.toLowerCase().equals("bolivianos")){
            System.out.println("Se realiza el cambio de moneda de Dolares a Bolivianos");
            conversion=conversion*6.97;
        }
        if(conversion<= cuentaBancaria.getSaldo()){
            System.out.println("Realizando retiro");
            servicioBancario.realizarRetiro(cuentaBancaria,conversion,moneda);
        }else{
            System.out.println("No se puede realizar el retiro porque el monto supera el saldo");
            System.out.println("Saldo disponible: "+cuentaBancaria.getSaldo()+" Bolivianos");
            System.out.println("Cantidad deseada para sacar: "+cantRetiro+" "+moneda);
        }
        System.out.println("*******************************************");


    }
}
