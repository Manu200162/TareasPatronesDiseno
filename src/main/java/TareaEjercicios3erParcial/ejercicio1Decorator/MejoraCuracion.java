package TareaEjercicios3erParcial.ejercicio1Decorator;

public class MejoraCuracion extends Mejoras {
    private String complementoArmas;

    public MejoraCuracion(Component component, String complementoArmas) {
        super(component);
        this.complementoArmas=super.getArmas()+complementoArmas;
        super.setArmas(complementoArmas);
    }


    @Override
    public void operation(){
        super.operation();
        //double mejoraRegeneracion=super.getPuntosRegeneracion()*0.8;
        if(complementoArmas.contains("posion de curacion")){
            System.out.println("Los puntos de regenracion suben");
            super.setPuntosRegeneracion(super.getPuntosRegeneracion()+80);
            System.out.println("Puntos de regeneracion: "+(int)super.getPuntosRegeneracion());
        }else{
            System.out.println("Nose subiran los puntos de regeneracion porque no hay posion de curacion");
        }

        System.out.println("-----------------------------------------------------");

    }

}
