package TareaStateComputadora;

public class Apagado implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagando **");
        System.out.println("Los porgramas se estan cerrando");
        computadora.setUsoCpu(0);
        computadora.setUsoMemoriaRam(0);
        System.out.println("Se dejo de utilizar los recursos, consumo de cpu:"+computadora.getUsoCpu()+" %"
        +"consumo de RAM: "+computadora.getUsoMemoriaRam()+" %");
    }
}
