package TareaChainOfRespobsability.Ejercicio3;

public class Algoritmo3 implements IOrdenamiento{
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
        System.out.println("INFO> se utilizara el agoritmo de Selection Sort ");
        Persona[] arr=Selectionsort(personas);
        printArray(arr);
    }

    public Persona[] Selectionsort(Persona arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getEdad() < arr[min_idx].getEdad())
                    min_idx = j;

            Persona temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public void printArray(Persona arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getEdad()+" ");
        System.out.println();
    }




}
