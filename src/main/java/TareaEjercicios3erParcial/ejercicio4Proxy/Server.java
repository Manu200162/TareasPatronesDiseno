package TareaEjercicios3erParcial.ejercicio4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Server implements IServer{
    private String nombreServidor;
    private String ip;
    private String port;
    private List<User> storeUsers;

    public Server(String nombreServidor, String ip, String port) {
        this.nombreServidor = nombreServidor;
        this.ip = ip;
        this.port = port;
        this.storeUsers = new ArrayList<>();
    }

    @Override
    public void loginUser(User user, String nUser, String pwd) {
        System.out.println("Usuario loggeado");
        storeUsers.add(user);
        System.out.println("Nombre usuario: "+user.getNameUser());
    }
}
