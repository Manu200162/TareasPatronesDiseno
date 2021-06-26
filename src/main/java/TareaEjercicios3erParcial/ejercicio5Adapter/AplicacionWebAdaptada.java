package TareaEjercicios3erParcial.ejercicio5Adapter;

public class AplicacionWebAdaptada implements IDesarrolladoraApps{

    private AplicacionWeb aplicacionWeb;

    public AplicacionWebAdaptada(AplicacionWeb aplicacionWeb){
        System.out.println("Se inicia la conversion de aplicacion web a la famia de IAPPs");
        this.aplicacionWeb=aplicacionWeb;
    }



    @Override
    public void logIn(User user) {
        System.out.println("Conversion de aplicacion web a IApp");
        this.aplicacionWeb.iniciarSesion();
        System.out.println("Informacion del usuario");
        user.showInfo();
    }

    @Override
    public void logOut(User user) {
        System.out.println("Conversion de aplicacion web a IApp");
        this.aplicacionWeb.cerrarSesion();
        System.out.println("Informacion del usuario");
        user.showInfo();
    }

    @Override
    public void reportes(String reporte) {
        System.out.println("Conversion de aplicacion web a IApp");
        this.aplicacionWeb.generacionDatos(reporte);
    }
}
