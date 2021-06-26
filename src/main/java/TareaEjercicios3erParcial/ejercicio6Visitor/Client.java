package TareaEjercicios3erParcial.ejercicio6Visitor;

public class Client {
    public static void main(String[] args){
        Celular celular = new Celular("S20+","8084848DGDR787","1 año","Andorid 11");
        Computadora computadora= new Computadora("gamer","Windows 11","intel core i9");
        Televisor televisor= new Televisor("Samsung","QUHD series 8","65","8k");

        ScannerOptimizador scanner= new ScannerOptimizador();

        celular.accept(scanner);
        computadora.accept(scanner);
        televisor.accept(scanner);
    }
}
