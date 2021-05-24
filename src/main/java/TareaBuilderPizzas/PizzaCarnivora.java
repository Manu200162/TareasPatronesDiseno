package TareaBuilderPizzas;

public class PizzaCarnivora extends Builder {

    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("Carne, salsa de tomate, chorizo, salame");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("quezo mozarella");
    }
}
