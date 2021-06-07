package TareaChainOfRespobsability.Ejercicio3;

public class AlgoritmoOrdenamiento implements IOrdenamiento{
    private IOrdenamiento next;

    @Override
    public void setNext(IOrdenamiento handler) {
        this.next= handler;
    }

    @Override
    public IOrdenamiento next() {
        return this.next;
    }

    @Override
    public void realizarOrdenamiento(Persona[] personas) {
        Algoritmo1 algoritmo1 = new Algoritmo1();
        this.setNext(algoritmo1);

        Algoritmo2 algoritmo2 = new Algoritmo2();
        algoritmo1.setNext(algoritmo2);

        Algoritmo3 algoritmo3 = new Algoritmo3();
        algoritmo2.setNext(algoritmo3);

        this.next.realizarOrdenamiento(personas);
    }

}
