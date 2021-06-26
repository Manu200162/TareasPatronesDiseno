package TareaEjercicios3erParcial.ejercicio5Adapter;

public class User {

    private String username;
    private String edad;
    private String paisResidencia;

    public User(String username, String edad, String paisResidencia) {
        this.username = username;
        this.edad = edad;
        this.paisResidencia=paisResidencia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void showInfo(){
        System.out.println("User name: "+username);
        System.out.println("Edad: "+ edad);
        System.out.println("Pais de residencia: "+paisResidencia);
    }

}
