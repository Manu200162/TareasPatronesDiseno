package TareaExtraPrimerParcial.factoryMethod;

public class Client {

    public static void main (String[] args){
        CreatorKits kit_escolar = new Create_kit_escolar();
        kit_escolar.creator().crear();

        CreatorKits kit_colegial = new Create_Kit_colegial();
        kit_colegial.creator().crear();
    }

}
