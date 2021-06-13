package TareaEjercicios2doParcial.ExtraSingleton_6;

public class CuentaBancaria {
    private static CuentaBancaria instancia;

    private CuentaBancaria(){
        System.out.println("*******************Instanciando Cuenta de banco**************");
    }

    public static synchronized  void makeInstance(){
        if(instancia == null){
            instancia =new CuentaBancaria();
        }
    }

    public static synchronized CuentaBancaria getInstance(){
        if(instancia == null){
            makeInstance();
        }
        return instancia;
    }

    public synchronized void relaizarPagoPrestamo(int cantidad, Persona persona){
        int cienporciento = persona.getMontoPrestamo();
        int cicuentaPorciento= persona.getMontoPrestamo()/2;
        int veinticincoPorciento = persona.getMontoPrestamo()/4;
        persona.setCantidadAPagar(cantidad+ persona.getCantidadAPagar());
        System.out.println("***********************************************************");
        if(persona.getCantidadAPagar()< veinticincoPorciento){
            System.out.println("El cajero recibe el pago de prestamo de la persona con los siguientes datos: ");
        }else if(persona.getCantidadAPagar()>=veinticincoPorciento && persona.getCantidadAPagar()<cicuentaPorciento){
            System.out.println("Se ofrece un refinanciamiento del prestamo");
            System.out.println("El agente de credito recibe el pago del prestamo  de la persona con los siguientes datos: ");
        }else if(persona.getCantidadAPagar()>=cicuentaPorciento && persona.getCantidadAPagar()< cienporciento){
            System.out.println("El supervisor ofrece nuevos prestamos y recibe el pago de la persona con los siguientes datos: ");
        }else if(persona.getCantidadAPagar() == cienporciento){
            System.out.println("El encargado de prestamos recibe el ultimo pago  y devuelve los papeles de la persona" +
                    " con los siguientes datos: ");
        }
        persona.showInfo();
        System.out.println("***********************************************************");

    }
}
