package TareaEjercicios3erParcial.ejercicio5Adapter;

public class Client {
    public static void main(String[] args){

        //Aplicaciones de la empresa 2
        AplicacionWeb aplicacionWeb = new AplicacionWeb();
        AplicacionEscritorio aplicacionEscritorio = new AplicacionEscritorio();

        //Aplicaciones de la empresa 1
        Android android = new Android();
        IOS ios = new IOS();
        WindowsPhone windowsPhone = new WindowsPhone();

        //Metodos empresa 1

        android.logIn(new User("Lusi6","16 años","USA"));
        System.out.println();
        ios.reportes("La aplicacion esta yendo muy lenta");
        System.out.println();
        windowsPhone.logOut(new User("Luis45","45 años","Colombia"));
        System.out.println();
        ios.logIn(new User("Andre484","25 años","Bolivia"));
        System.out.println();


        //Aplicaciones de la empresa 2 adaptadas
        AplicacionWebAdaptada aplicacionWebAdaptada = new AplicacionWebAdaptada(aplicacionWeb);
        aplicacionWebAdaptada.logIn(new User("Pedro56","16 años","Argentina"));
        System.out.println();
        AplicacionEscritorioAdaptada aplicacionEscritorioAdaptada = new AplicacionEscritorioAdaptada(aplicacionEscritorio);
        aplicacionEscritorioAdaptada.reportes("La aplicacion falla al actualizarse");
        System.out.println();
    }
}
