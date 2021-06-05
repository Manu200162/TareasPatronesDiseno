package TareaMementoBaseDatos;

import java.util.List;

public class BaseDatos {
    private String nombre;
    private List<Persona> listaPersonas;


    public BaseDatos(String nombre, List<Persona>listaPersonas){
        this.nombre=nombre;
        this.listaPersonas=listaPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void ShowDB(){
        System.out.println("*************************************");
        System.out.println("Nombre Backup: "+nombre);
        System.out.println("Lista de personas");
        for(int i=0; i<listaPersonas.size();i++){
            listaPersonas.get(i).showPersona();
        }
        System.out.println("*************************************");
    }
}
