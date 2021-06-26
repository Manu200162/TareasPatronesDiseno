package TareaEjercicios3erParcial.ejercicio1Decorator;

public class Client {
    public static void main(String[] args){
    Component personaje= new Personaje(" Jose 35",10,"ballesta");
    personaje= new MejoraAtaque(personaje,"hacha,espada,escopeta");
    personaje=new MejoraCuracion(personaje,"posion de curacion");
    personaje=new MejoraDefensa(personaje,"escudo");
    personaje.operation();

    }
}
