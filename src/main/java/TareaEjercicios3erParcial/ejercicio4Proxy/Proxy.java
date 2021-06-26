package TareaEjercicios3erParcial.ejercicio4Proxy;

public class Proxy implements IServer{
    private Server server1= new Server("server1","162.168.62.4","8080");
    private Server server2= new Server("server2","172.68.72.4","8081");

    public Proxy(){
        System.out.println("Iniciando el proxy --------");
    }

    @Override
    public void loginUser(User user,String nUser, String pwd) {
        if(user.getNameUser().equals(nUser) && user.getPwd().equals(pwd)){
             if(user.getNumUser()%2 == 0){
                 System.out.println("Ingresando al primer servidor");
                 server1.loginUser(user, nUser, pwd);
             }else{
                 System.out.println("Ingresando al segundo servidor");
                 server2.loginUser(user, nUser, pwd);
             }
        }else{
            System.out.println("El nombre del usuario o la contraseña son incorrectos");
        }
        System.out.println("***************************************************************");

    }
}
