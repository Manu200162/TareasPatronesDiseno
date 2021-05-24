package TareaBuilderPizzas;

public class PizzaClasica extends Builder{
    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("salsa de tomate, harina,levadura, queso rallado, jamon");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa tradicional");
    }

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("doble quezo mozarella tipo2");
    }
}
