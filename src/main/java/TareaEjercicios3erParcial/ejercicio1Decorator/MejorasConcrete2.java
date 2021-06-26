package TareaEjercicios3erParcial.ejercicio1Decorator;

public class MejorasConcrete2 extends Mejoras {
    private String attribute1;
    private int attribute2;


    public MejorasConcrete2(Component component) {
        super(component);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }



    @Override
    public void operation(){
        super.operation();
        // agregando funcionalidad
        this.attribute1="nueva funcionalidad";
        this.attribute2=1;

        System.out.println("INFO>.....Agregando funcionalidad (DecoratorConcrete2)");
    }

}
