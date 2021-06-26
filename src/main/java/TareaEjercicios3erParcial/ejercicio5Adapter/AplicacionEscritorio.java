package TareaEjercicios3erParcial.ejercicio5Adapter;

public class AplicacionEscritorio implements IDEsarrolladoraWeb{

    @Override
    public void iniciarSesion() {
        System.out.println("Se esta iniciando sesion de la aplicacion escritorio");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Se esta cerrando secion de la aplicacion de escritorio");
    }

    @Override
    public void generacionDatos(String datos) {
    System.out.println("Desde la Aplicacion de escritorio se generan los siguientes datos: "+datos);
    }
}
