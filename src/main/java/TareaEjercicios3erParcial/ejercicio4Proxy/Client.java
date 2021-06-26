package TareaEjercicios3erParcial.ejercicio4Proxy;

public class Client {
    public static void main(String[] args){
        User user1= new User(1,"Jose456","Helo123jose");
        User user57= new User(57,"Lu56","56lu2021");
        User user34= new User(34,"LordPalomo4545","palomo34L");
        User user5 = new User(5,"Pedrs22","dro2001Pe");

        Proxy logInProxy = new Proxy();
        logInProxy.loginUser(user34,"LordPalomo4545","palomo34L");
        logInProxy.loginUser(user1,"Jose78","Helo123jose");
        logInProxy.loginUser(user57,"Lu56","56lu2021");
        logInProxy.loginUser(user5,"Pedrs22","dro2001Pe");

    }
}
