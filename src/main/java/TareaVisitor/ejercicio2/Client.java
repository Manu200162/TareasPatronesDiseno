package TareaVisitor.ejercicio2;

public class Client {
    public static void main(String[] args){
        Bolivia bolivia = new Bolivia();
        Argentina argentina = new Argentina();
        Brasil brasil= new Brasil();
        Italia italia= new Italia();

        Librecambista librecambista = new Librecambista();
        System.out.println("*******************************************");
        bolivia.accept(librecambista,false,70);
        bolivia.accept(librecambista,true,70);
        System.out.println("*******************************************");
        argentina.accept(librecambista,true,150);
        argentina.accept(librecambista,false,150);
        System.out.println("*******************************************");
        brasil.accept(librecambista,true,500);
        brasil.accept(librecambista,false,500);
        System.out.println("*******************************************");
        italia.accept(librecambista,true,50);
        italia.accept(librecambista,false,50);
        System.out.println("*******************************************");



    }
}
