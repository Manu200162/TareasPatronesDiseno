package TareaChainOfRespobsability.Ejercicio2;

public class Client {

    public static void main(String[] args){
        Carnetizacion carnetizacion = new Carnetizacion();

        carnetizacion.realizarCarnetizacion(new Persona(
                "Jose1",true,true,true));
        carnetizacion.realizarCarnetizacion(new Persona(
                "Jose2",false,true,true));
        carnetizacion.realizarCarnetizacion(new Persona(
                "Jose3",false,true,false));
        carnetizacion.realizarCarnetizacion(new Persona(
                "Jose4",true,false,true));

    }
}
