package TareaEjercicios3erParcial.ejercicio1Decorator;

import java.text.DecimalFormat;

public class MejoraAtaque extends Mejoras {
    private String complementoArmas;

    public MejoraAtaque(Component component, String complementoArmas) {
        super(component);
        this.complementoArmas=super.getArmas()+complementoArmas;
        super.setArmas(complementoArmas);
    }


    @Override
    public void operation(){
        super.operation();
        if(complementoArmas.contains("espada") &&
                complementoArmas.contains("hacha") &&complementoArmas.contains("escopeta")){
            System.out.println("El nivel de ataque sube y el nivel se duplica");
            super.setPuntosAtaque(super.getPuntosAtaque()+30);
            super.setNivel(super.getNivel()*2);
            System.out.println("Nivel: "+super.getNivel());
            System.out.println("Puntos de ataque:"+(int)super.getPuntosAtaque());
        }else{
            System.out.println("No se subira los puntos de ataque porque no se cuenta con las armas necesarias");
        }
        System.out.println("-----------------------------------------------------");

    }

}
