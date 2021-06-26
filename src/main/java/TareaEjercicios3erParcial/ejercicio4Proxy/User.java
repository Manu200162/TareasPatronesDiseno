package TareaEjercicios3erParcial.ejercicio4Proxy;

public class User {
    private int numUser;
    private String nameUser;
    private String pwd;

    public User(int numUser, String nameUser, String pwd) {
        this.numUser = numUser;
        this.nameUser = nameUser;
        this.pwd = pwd;
    }

    public int getNumUser() {
        return numUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getPwd() {
        return pwd;
    }
}
