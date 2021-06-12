package TareaeEjercicios2doParcial.Strategy_4;

import java.util.List;

public class BusquedaGrande implements IModoBusqueda{
    @Override
    public void realizarBusqueda(List<Celular> celularList, String filtroBusqueda) {
        if(filtroBusqueda.contains("precio: ") && filtroBusqueda.contains("modelo: ")){
            System.out.println("La lista de elementos es muy grande, se utlizara un algoritmo especial ");
            System.out.println("para busquedas grandes para una busca por modelo y precio para la siguiente consulta:");
        }else if(filtroBusqueda.contains("modelo: ")){
            System.out.println("La lista de elementos es muy grande, se utlizara un algoritmo especial ");
            System.out.println("para busquedas grandes para una busca por modelo para la siguiente consulta:");
        }else if(filtroBusqueda.contains("precio: ")){
            System.out.println("La lista de elementos es muy grande, se utlizara un algoritmo especial ");
            System.out.println("para busquedas grandes para una busca por precio para la siguiente consulta:");
        }
        System.out.println(filtroBusqueda);
    }
}
