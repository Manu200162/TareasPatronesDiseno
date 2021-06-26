package TareaEjercicios3erParcial.ejercicio1Decorator;

public class MejoraDefensa extends Mejoras {
    private String complementoArmas;

    public MejoraDefensa(Component component, String complementoArmas) {
        super(component);
        this.complementoArmas=super.getComponent().getArmas()+complementoArmas;
        super.setArmas(complementoArmas);
    }


    @Override
    public void operation(){
        super.operation();
        //double mejoraDefensa= super.getPuntosDefensa()*0.35;
        //double mejoraArmadura=super.getPorcentajeDeArmadura()*0.1;
        if(complementoArmas.contains("escudo")){
            System.out.println("Se mejora la defensa del personaje");
            super.setPuntosDefensa(super.getPuntosDefensa()+35);
            super.setPorcentajeDeArmadura(super.getPorcentajeDeArmadura()+10);
            System.out.println("Puntos de defensa: "+(int)super.getPuntosDefensa());
            if(super.getPorcentajeDeArmadura()>100) {
                System.out.println("El porcentaje ya est al maximo");
                super.setPorcentajeDeArmadura(100);
            }
            System.out.println("Porcentaje de armadura: "+(int)super.getPorcentajeDeArmadura()+" %");
        }else{
            System.out.println("No subira la defensa porque no se tiene escudo");
        }
        System.out.println("-----------------------------------------------------");

    }

}
