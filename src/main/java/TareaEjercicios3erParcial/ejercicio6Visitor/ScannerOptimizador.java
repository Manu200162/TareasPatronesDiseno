package TareaEjercicios3erParcial.ejercicio6Visitor;

public class ScannerOptimizador implements IScannerElectronicos {
    @Override
    public void realizarRevision(Celular celular) {
        System.out.println("Los atributos del celular son: ");
        System.out.println();
        celular.showInfo();
        System.out.println();
        System.out.println("Se recomienda aplicar una mantenimiento preventivo");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void realizarRevision(Computadora computadora) {
        int num =(int)(Math.random()*80-1);
        if(num%2==0){
            System.out.println("Para la computadora se recomienda mantenimiento preventivo");
        }else{
            System.out.println("Para la computadora se recomienda mantenimiento correctivo");
            System.out.println("--------------------------------------------");
        }
        System.out.println("--------------------------------------------");
    }

    @Override
    public void realizarRevision(Televisor televisor) {
         System.out.println("Caracteristicas del televisor:");
         System.out.println("Marca: "+televisor.getMarca());
         System.out.println("Pulgadas: "+televisor.getPulgadas());
         System.out.println("Resolucion: " +televisor.getResolucion());
         System.out.println("--------------------------------------------");

    }
}
