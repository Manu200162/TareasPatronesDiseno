package TareaChainOfRespobsability.Ejercicio3;

public class Algoritmo2 implements IOrdenamiento{
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
            if(personas.length <=50){
                System.out.println("INFO> se utilizara el agoritmo de Insertion Sort ");
                Persona[]arr=InsertionSort(personas);
                printArray(arr);

            }else{
                this.next.realizarOrdenamiento(personas);
            }
    }

    public Persona[] InsertionSort(Persona arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Persona key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getEdad() > key.getEdad()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void printArray(Persona arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i].getEdad() + " ");

        System.out.println();
    }
}
