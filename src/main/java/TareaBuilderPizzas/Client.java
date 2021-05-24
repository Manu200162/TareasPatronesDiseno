package TareaBuilderPizzas;

public class Client {

    public static void main (String [] args){
        Cocinero julio = new Cocinero();
        PizzaCarnivora pc= new PizzaCarnivora();
        PizzaHawaiana ph=new PizzaHawaiana();
        PizzaClasica pcl= new PizzaClasica();

        julio.setBuilderPizza(pc);
        julio.prepararPizza();

        Pizza pizzaCar = julio.getPizza();
        pizzaCar.showInfo();

        julio.setBuilderPizza(ph);
        julio.prepararPizza();

        Pizza pizzaHawaiana = julio.getPizza();
        pizzaHawaiana.showInfo();

        julio.setBuilderPizza(pcl);
        julio.prepararPizza();

        Pizza pizzaClasica = julio.getPizza();
        pizzaClasica.showInfo();

    }
}
