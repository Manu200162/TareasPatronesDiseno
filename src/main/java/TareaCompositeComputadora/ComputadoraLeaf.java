package TareaCompositeComputadora;

public class ComputadoraLeaf extends Component{


    public ComputadoraLeaf(String nombre) {
        super(nombre);
    }

    @Override
    public int operation() {
        System.out.println(getNombre()+" Precio: " + getPrecio());
        return this.getPrecio();
    }

    @Override
    public void add(Component component) {
        System.out.println("No applicable");

    }

    @Override
    public void remove(Component component) {
        System.out.println("No applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No applicable");
    }
}
