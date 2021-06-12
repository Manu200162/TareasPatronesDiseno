package TareaeEjercicios2doParcial.ChainOfResponsability_2;

public class Client {

    public static void main (String [] args){

        RealizarOrden ordenar = new RealizarOrden();

        ordenar.realizarOrden("Los baños estan sucios se necesita limpieza");
        ordenar.realizarOrden("Se debe realizar entrevistas a los nuevos reclutas");
        ordenar.realizarOrden("Actualmente hay problemas en el centro se debe proceder al desbloqueo");
        ordenar.realizarOrden("Reclutas recien integrados nececitan de disciplina");
        ordenar.realizarOrden("El dia sabado un desfile, se debe preparar la seguridad");

    }
}
