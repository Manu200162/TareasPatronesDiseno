package TareaEjercicios3erParcial.ejercicio5Adapter;

public class AplicacionWeb implements IDEsarrolladoraWeb{

    @Override
    public void iniciarSesion() {
        System.out.println("Se esta iniciando sesion de la aplicacion web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Se esta cerrando secion de la aplicacion Web");
    }

    @Override
    public void generacionDatos(String datos) {
    System.out.println("Desde la AplicacionWeb se generan los siguientes datos: "+datos);
    }
}
