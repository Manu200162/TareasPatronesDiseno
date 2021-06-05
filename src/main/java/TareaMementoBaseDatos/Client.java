package TareaMementoBaseDatos;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args){
    AlmacenBackUps almacen = new AlmacenBackUps();
    BackUp backUp = new BackUp();
    List<Persona> personas = new ArrayList<>();
    personas.add(new Persona("Jose1","0010","25 años"));
    personas.add(new Persona("Jose2","0011","25 años"));
    personas.add(new Persona("Jose3","0012","27 años"));
    personas.add(new Persona("Jose4","0013","23 años"));
    personas.add(new Persona("Jose5","0014","24 años"));


    BaseDatos baseDatos;

    baseDatos= new BaseDatos("BackUpMarzo",personas);
    personas.remove(1);
    personas.add(new Persona("Jose6","0015","24 años"));
    personas.add(new Persona("Jose7","0016","22 años"));

    baseDatos= new BaseDatos("BackUpAbril",personas);
    backUp.setState(baseDatos);
    almacen.createBackUp(baseDatos.getNombre(), backUp.createBackUp());
    personas.remove(3);
    personas.remove(0);

    baseDatos= new BaseDatos("BackUpMayo",personas);
    personas.add(new Persona("Jose8","0017","25 años"));
    personas.add(new Persona("Jose9","0018","27 años"));

    baseDatos= new BaseDatos("BackUpJunio",personas);
    personas.remove(3);
    personas.add(new Persona("Jose10","0019","24 años"));


    baseDatos= new BaseDatos("BackUpJulio",personas);
    backUp.setState(baseDatos);
    personas.add(new Persona("Jose11","0020","23 años"));
    personas.remove(0);
    personas.remove(1);


    backUp.restoreFromMemento(almacen.getMemento("BackUpAbril"));

}
}
