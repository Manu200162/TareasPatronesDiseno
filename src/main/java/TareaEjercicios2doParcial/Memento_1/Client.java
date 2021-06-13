package TareaEjercicios2doParcial.Memento_1;

public class Client {

    public static void main(String[] args){

    AlmacenRevisiones almacen = new AlmacenRevisiones();
    EstadoTesis estadoTesis =new EstadoTesis();

    Tesis tesis;

    tesis = new Tesis("Introduccion, Indice, Hipotesis",2,true);
    estadoTesis.setState(tesis);
    almacen.createVersion(1,estadoTesis.createRevision());
    tesis = new Tesis("Introduccion, Indice, Hipotesis, Marco teorico",3,false);
    estadoTesis.setState(tesis);
    almacen.createVersion(2,estadoTesis.createRevision());
    tesis = new Tesis("Introduccion, Indice, Hipotesis, Marco teorico",4,true);
    estadoTesis.setState(tesis);
    almacen.createVersion(3,estadoTesis.createRevision());
    tesis = new Tesis("Introduccion, Indice, Hipotesis, Marco teorico, Marco Practico",
            4,false);
    estadoTesis.setState(tesis);
    almacen.createVersion(4,estadoTesis.createRevision());
    tesis = new Tesis("Introduccion, Indice, Hipotesis, Marco teorico, Marco Practico, " +
            "Conclusion",5,true);
    estadoTesis.setState(tesis);
    almacen.createVersion(5,estadoTesis.createRevision());

    estadoTesis.restoreFromMemento(almacen.getMemento(3));

    }
}
