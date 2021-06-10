package TareaStateComputadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prendido implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Prendido **");
        //int num = new Random().nextInt(20);
        int num = (int)(Math.random()*20+1);
        computadora.setUsoCpu(0);
        List<String> programas = new ArrayList<>();
        int consumo= 0;
        int numProgramas=1;
        for(int i = 5 ;i <= num;i=i+5 ){
            programas.add("Programa"+numProgramas);
            numProgramas++;
            consumo = consumo+5;
        }
        computadora.setListaProgramas(programas);
        computadora.setUsoCpu(consumo);
        System.out.println("Se abrieron: "+computadora.getListaProgramas().size()+" programas");
        System.out.println("El consumo de cpu es: "+computadora.getUsoCpu()+" %");
    }
}
