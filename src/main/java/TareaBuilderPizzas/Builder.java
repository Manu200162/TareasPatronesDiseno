package TareaBuilderPizzas;

public abstract class Builder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void createPizza(){
        pizza=new Pizza();
    }

    public abstract void buildIngredientes();
    public abstract void buildTipoMasa();
    public abstract void buildTipoQueso();

}
