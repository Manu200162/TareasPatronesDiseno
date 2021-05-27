package TareaInterpreterUserHistories;

public class Client {


    public static void main (String[] args ){
        String oracion ="Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        InterpreterOraciones io= new InterpreterOraciones(oracion);
        System.out.println("Oracion entrada: "+oracion);
        System.out.println("Oracion Salida: "+io.interpretar());
    }

}
