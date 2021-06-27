package TareaEjercicios3erParcial.ejercicio7Extra;

public class Client {
    public static void main(String[] args){
        Dueno dueno1=new Dueno("Jose Fernandez","Presidente");
        Dueno dueno2= new Dueno("Joaquin Perez","VicePresidente");
        Dueno dueno3=new Dueno("Pedro Valda","Contabilidad");

        CuentaBancaria cuentaBancaria = CuentaBancaria.getInstance();
        cuentaBancaria.attachDueno(dueno1);
        cuentaBancaria.attachDueno(dueno2);
        cuentaBancaria.attachDueno(dueno3);

        Customer customer1= new Customer("Pedro1","500478934LP");
        customer1.solicitarServicioTecnico(new Tablet("Samsung","S7",12,45));
        Customer customer2= new Customer("Pedro2","40561201LP");
        customer2.solicitarServicioTecnico(new PC("Gamer",3,"intel i7",100));
        Customer customer3= new Customer("Pedro3","801456975LP");
        customer3.solicitarServicioTecnico(new Laptop("Hp",15,false,50));
        System.out.println("--------------------------------------------------------------");

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                customer1.pagarPorElServicio(270);
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                customer2.pagarPorElServicio(150);
            }
        });
        Thread thread3= new Thread(new Runnable() {
            @Override
            public void run() {
                customer3.pagarPorElServicio(375);
            }
        });
        thread1.run();
        thread2.run();
        thread3.run();
    }
}
