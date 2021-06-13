package TareaEjercicios2doParcial.MementoObserver_3;

public class Desarrollador implements IDesarrollador {
    private String nombre;
    private String nivelDesarrolador;

    public Desarrollador(String nombre, String nivelDesarrolador) {
        this.nombre = nombre;
        this.nivelDesarrolador = nivelDesarrolador;
    }

    @Override
    public void update(String Message, Codigo codigo) {
        System.out.println("************Notificacion****************");
        System.out.println(Message);
        System.out.println("Nombre desarrollador: "+nombre);
        System.out.println("Informacion del codigo: ");
        codigo.info();
        System.out.println("*******************************************");
    }
}
