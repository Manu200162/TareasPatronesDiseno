package TareaEjercicios3erParcial.ejercicio5Adapter;

public class IOS implements IDesarrolladoraApps{
    private String reporte;

    @Override
    public void logIn(User user) {
        System.out.println("Se esta loggeando al usuario de IOS con la siguiente informacion");
        user.showInfo();
    }

    @Override
    public void logOut(User user) {
        System.out.println("Se esta registrando la salida del usuario de IOS con la siguiente informacion");
        user.showInfo();
    }

    @Override
    public void reportes(String reporte) {
        this.reporte= reporte;
        System.out.println("Reporte registrado: "+this.reporte);
    }
}
