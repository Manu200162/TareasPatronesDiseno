package TareaeEjercicios2doParcial.Strategy_4;

import TareaMementoBaseDatos.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Cliente {

    public static void main(String[] args){
        TiendaCelulares tiendaCelulares = new TiendaCelulares();
        List<Celular> celularList = new ArrayList<>();
        int min_val = 100;
        int max_val = 1000;
        int num = (int)(Math.random()*80+1);
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int randomNum;
        int numModelo = 1;
        for(int i=1 ;i<=num ; i++){
            randomNum=tlr.nextInt(min_val, max_val + 1);
            celularList.add(new Celular("Modelo"+numModelo,"Samsung","Media",randomNum));
            numModelo++;
        }
        System.out.println("El tamaño de la lista de celulares es: "+celularList.size());
        tiendaCelulares.setCelularList(celularList);


        if(tiendaCelulares.getCelularList().size()<=20){
            tiendaCelulares.setModoBusqueda(new BusquedaPequenia());
        }else{
            tiendaCelulares.setModoBusqueda(new BusquedaGrande());
        }
        tiendaCelulares.usarModuloDeBusqueda("precio: 250 , modelo: Modelo5");
        tiendaCelulares.usarModuloDeBusqueda("modelo: Modelo8");
        tiendaCelulares.usarModuloDeBusqueda("precio: 789");
    }
}
