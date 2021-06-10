package TareaStateComputadora;


import java.util.ArrayList;

public class Client {

    public static void main(String[]args){
        IStateComputadora state = new Prendido();
        Computadora computadora = new Computadora();
        computadora.setListaProgramas(new ArrayList<>());
        computadora.setState(state);
        computadora.request();

        state = new Reiniciar();
        computadora.setState(state);
        computadora.request();


        state = new Apagado();
        computadora.setState(state);
        computadora.request();

        state = new Prendido();
        computadora.setState(state);
        computadora.request();
    }

}
