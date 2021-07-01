package TareaDecorator;

public class BancaPorInternet extends FuncionalidadExtra{
    private boolean enable;


    public BancaPorInternet(Component component, Boolean enable) {
        super(component);
        this.enable=enable;
    }

    @Override
    public void operation(){
       super.operation();
        if(enable){
            System.out.println("La banca por internet para esta cuenta esta abilitada");
        }else{
           System.out.println("La banca por internet para esta cuenta esta desbilitada");
        }
    }
}
