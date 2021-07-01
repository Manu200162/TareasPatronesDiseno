package TareaDecorator;

public class Seguro extends FuncionalidadExtra{
    private String tipoSeguro;
    private int seguro;


    public Seguro(Component component, String tipoSeguro) {
        super(component);
        this.tipoSeguro=tipoSeguro;
        if(tipoSeguro.equals("Bajo")){
            seguro=10;
        }else if(tipoSeguro.equals("Alto")){
            seguro=20;
        }
    }

    @Override
    public void operation(){
        super.operation();
        System.out.println("Se esta cobrando el seguro");
        //super.getComponent().setMonto(super.getComponent().getMonto()-seguro);
        super.setMonto(super.getMonto()-seguro);
        System.out.println("El monto disponible es :"+super.getMonto());
        //System.out.println("El monto disponible es :"+super.getComponent().getMonto());
    }
}
