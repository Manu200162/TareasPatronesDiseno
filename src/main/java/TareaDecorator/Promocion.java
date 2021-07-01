package TareaDecorator;

public class Promocion extends FuncionalidadExtra{
    private int numRandom;

    public Promocion(Component component) {
        super(component);
        numRandom=(int)(Math.random()*80-1);
    }

    @Override
    public void operation(){
        super.operation();
        System.out.println("El numero randomico es: "+numRandom);
        if(numRandom % 2 ==0){
            System.out.println("El numero randomico es par, se duplica el monto");
            //super.getComponent().setMonto(super.getComponent().getMonto()*2);
            super.setMonto(super.getMonto()*2);
            System.out.println("El monto de la cuenta es: "+super.getMonto());
            //System.out.println("El monto de la cuenta es: "+super.getComponent().getMonto());
        }else{
            System.out.println("El numero randomico es no es par, no se duplica el monto");
            System.out.println("El monto de la cuenta es: "+super.getMonto());
            //System.out.println("El monto de la cuenta es: "+super.getComponent().getMonto());
        }
    }
}
