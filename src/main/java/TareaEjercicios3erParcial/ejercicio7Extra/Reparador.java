package TareaEjercicios3erParcial.ejercicio7Extra;

public class Reparador implements IModoReparacion{

    @Override
    public void recibirReparacion(Tablet tablet) {
        System.out.println("El tecnico de laptops llevara herramientas para reparar la tablet");
        int precioACobrar=(tablet.getTamanio()*tablet.getPulgadas())/2;
        System.out.println("El precio a cobrar por la reparacion sera: "+precioACobrar+" Bolivianos");
    }

    @Override
    public void recibirReparacion(PC pc) {
        System.out.println("El tecnico llevara herramientas para reparar la PC");
        int precioACobrar=(pc.getTamanio()*pc.getAntiguedad())/2;
        System.out.println("El precio a cobrar por la reparacion sera: "+precioACobrar+" Bolivianos");

    }

    @Override
    public void recibirReparacion(Laptop laptop) {
        System.out.println("El tecnico de laptops llevara herramientas para reparar la laptop");
        int precioACobrar=(laptop.getTamanio()*laptop.getPulgadas())/2;
        System.out.println("El precio a cobrar por la reparacion sera: "+precioACobrar+" Bolivianos");
    }
}
