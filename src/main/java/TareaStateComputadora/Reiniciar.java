package TareaStateComputadora;

import java.util.ArrayList;

public class Reiniciar implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Reiniciando **");
        computadora.setUsoCpu(5);
        computadora.setUsoMemoriaRam(10);
        computadora.setListaProgramas(new ArrayList<>());
        System.out.println("El uso de cpu esta al minimo: "+computadora.getUsoCpu()+" %");
        System.out.println("El uso de memoria ram es minimo: "+computadora.getUsoMemoriaRam()+"%");
        System.out.println("No hay programas abiertos "+ computadora.getListaProgramas().size());
    }
}
