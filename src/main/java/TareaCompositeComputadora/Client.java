package TareaCompositeComputadora;

public class Client {
    public static void main(String[] args){

        Composite lab1= new Composite("Laboratorio 1");
        lab1.add(new ComputadoraLeaf("Compu 1"));
        lab1.add(new ComputadoraLeaf("Compu 2"));
        lab1.add(new ComputadoraLeaf("Compu 3"));
        lab1.add(new ComputadoraLeaf("Compu 4"));

        Composite lab2= new Composite("laboratorio 2");
        lab2.add(new ComputadoraLeaf("Compu 5"));
        lab2.add(new ComputadoraLeaf("Compu 6"));
        lab2.add(new ComputadoraLeaf("Compu 7"));
        lab2.add(new ComputadoraLeaf("Compu 8"));

        Composite lab3= new Composite("laboratorio 3");
        lab3.add(new ComputadoraLeaf("Compu 9"));
        lab3.add(new ComputadoraLeaf("Compu 10"));
        lab3.add(new ComputadoraLeaf("Compu 11"));
        lab3.add(new ComputadoraLeaf("Compu 12"));

        Composite cont1 = new Composite("Contenedor 1");
        cont1.add(lab1);
        cont1.add(lab2);

        Composite cont2= new Composite("Contenedor 2");
        cont2.add(lab3);

        cont1.operation();
        cont2.operation();








    }
}
