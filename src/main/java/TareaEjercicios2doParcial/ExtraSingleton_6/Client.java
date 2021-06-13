package TareaEjercicios2doParcial.ExtraSingleton_6;

public class Client {

    public static void main(String[] args){
        Banco banco = new Banco();
        banco.setNombreBanco("Bisa");

        Persona persona1 = new Persona("Jose Perez","45023201",5000);
        banco.recibirPagoPrestamo(1000,persona1);
        banco.recibirPagoPrestamo(1000,persona1);
        banco.recibirPagoPrestamo(1000,persona1);
        banco.recibirPagoPrestamo(1000,persona1);
        banco.recibirPagoPrestamo(1000,persona1);


        Persona persona2 = new Persona("Juan Lopez","56487859",10000);
        banco.recibirPagoPrestamo(3000,persona2);
        banco.recibirPagoPrestamo(4000,persona2);
        banco.recibirPagoPrestamo(3000,persona2);
    }
}
