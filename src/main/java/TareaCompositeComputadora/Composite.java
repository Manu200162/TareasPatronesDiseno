package TareaCompositeComputadora;

import TareaStateComputadora.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private int precioTotal=0;
    private List<Component> componentList = new ArrayList<>();

    public Composite(String nombre) {
        super(nombre);
    }

    @Override
    public int operation() {
        for (Component component :componentList ) {
            precioTotal= precioTotal+component.operation();
        }
        System.out.println(getNombre()+" Precio Total : {" + precioTotal+"} Dolares");
        System.out.println("*************************************************");
        return precioTotal;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void getChild(int position) {
        componentList.get(position).showInfo();
    }
}
