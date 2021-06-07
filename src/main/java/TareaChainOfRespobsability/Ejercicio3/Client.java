package TareaChainOfRespobsability.Ejercicio3;

public class Client {

    public static void main (String[] args){
        AlgoritmoOrdenamiento algoritmoOrdenamiento = new AlgoritmoOrdenamiento();
        Persona[] p1 = new Persona[46];
        for(int i =0; i<p1.length;i++){
            int edad = (int)(Math.random()*80+1);
            p1[i] = new Persona("Juan"+i,"000"+i,edad);
        }
        Persona[] p2 = new Persona[52];
        for(int i =0; i<p2.length;i++){
            int edad = (int)(Math.random()*80+1);
            p2[i] = new Persona("Jose"+i,"111"+i,edad);
        }
        Persona[] p3 = new Persona[15];
        for(int i =0; i<p3.length;i++){
            int edad = (int)(Math.random()*80+1);
            p3[i] = new Persona("Julian"+i,"222"+i,edad);
        }

        algoritmoOrdenamiento.realizarOrdenamiento(p1);
        algoritmoOrdenamiento.realizarOrdenamiento(p2);
        algoritmoOrdenamiento.realizarOrdenamiento(p3);

    }
}
