package TareaEjercicios3erParcial.ejercicio5Adapter;

public class AplicacionEscritorioAdaptada implements IDesarrolladoraApps{

    private AplicacionEscritorio aplicacionEscritorio;

    public AplicacionEscritorioAdaptada(AplicacionEscritorio aplicacionEscritorio){
        System.out.println("Se inicia la conversion de aplicacion de escritorio a la famia de IAPPs");
        this.aplicacionEscritorio = aplicacionEscritorio;
    }



    @Override
    public void logIn(User user) {
        System.out.println("Conversion de aplicacion de escritorio a IApp");
        this.aplicacionEscritorio.iniciarSesion();
        System.out.println("Informacion del usuario");
        user.showInfo();
    }

    @Override
    public void logOut(User user) {
        System.out.println("Conversion de aplicacion de escritorio a IApp");
        this.aplicacionEscritorio.cerrarSesion();
        System.out.println("Informacion del usuario");
        user.showInfo();
    }

    @Override
    public void reportes(String reporte) {
        System.out.println("Conversion de aplicacion de escritorio a IApp");
        this.aplicacionEscritorio.generacionDatos(reporte);

    }
}
