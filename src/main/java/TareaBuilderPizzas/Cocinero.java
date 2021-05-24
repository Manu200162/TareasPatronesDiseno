package TareaBuilderPizzas;

public class Cocinero {
    private Builder builderPizza;
    public void setBuilderPizza(Builder builderPizza){
        this.builderPizza=builderPizza;
    }
    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void prepararPizza(){
        this.builderPizza.createPizza();
        this.builderPizza.buildIngredientes();
        this.builderPizza.buildTipoMasa();
        this.builderPizza.buildTipoQueso();
    }
}
