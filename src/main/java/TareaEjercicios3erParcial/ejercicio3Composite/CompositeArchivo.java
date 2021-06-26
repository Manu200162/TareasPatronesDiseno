package TareaEjercicios3erParcial.ejercicio3Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeArchivo extends Archivo{
    private int numTotalPalabras=0;
    private List<Archivo> archivoList = new ArrayList<>();

    public CompositeArchivo(String tipo){
        super(tipo);
    }

    @Override
    public int operation() {
        for(Archivo archivo: archivoList){
            numTotalPalabras= numTotalPalabras+archivo.operation();
        }
        System.out.println(getTipo()+" numero de palabras total: "+numTotalPalabras+" palabras");
        System.out.println("**********************************");
        return numTotalPalabras;
    }

    @Override
    public void add(Archivo component) {
        archivoList.add(component);
    }

    @Override
    public void remove(Archivo component) {
        archivoList.remove(component);
    }

    @Override
    public void getChild(int position) {
        archivoList.get(position).getNumPalabras();
    }
}
