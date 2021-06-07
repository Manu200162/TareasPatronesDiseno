package TareaChainOfRespobsability.Ejercicio3;

public class Algoritmo1 implements IOrdenamiento{
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
            if(personas.length <= 20){
                System.out.println("INFO> se utilizara el agoritmo de Bubble Sort ");
                Persona[] arr = bubbleSort(personas);
                printArray(arr);
            }else{
                this.next.realizarOrdenamiento(personas);
            }
    }

    public Persona[] bubbleSort(Persona arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getEdad() > arr[j+1].getEdad())
                {
                    Persona temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }

    public void printArray(Persona arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getEdad() + " ");
        System.out.println();
    }
}
