package TareaBuilderPizzas;

public class PizzaHawaiana extends Builder{
    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("piña, salsa de tomate, jamon ");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa normal");
    }

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("quezo mozarella tipo2");
    }
}
