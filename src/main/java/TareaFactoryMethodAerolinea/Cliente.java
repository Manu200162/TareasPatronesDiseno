package TareaFactoryMethodAerolinea;

public class Cliente {

    public static void main(String[] args){
        VoletoStandard voletoStandard1 = new CreatorVoletoStandard().create();
        voletoStandard1.setNumeroAsiento("156-C");
        voletoStandard1.getPasajero().setCi(7845411);
        voletoStandard1.getPasajero().setNombre("Miguel Gonzales");
        voletoStandard1.crear();

        VoletoStandard voletoStandard2 = new CreatorVoletoStandard().create();
        voletoStandard2.setNumeroAsiento("19-C");
        voletoStandard2.getPasajero().setCi(6312479);
        voletoStandard2.getPasajero().setNombre("Ximena Arzabe");
        voletoStandard2.crear();

        VoletoSolidario voletoSolidario1= new CreatorVoletoSolidario().create();
        voletoSolidario1.setNumeroAsiento("53-A");
        voletoSolidario1.getPasajero().setNombre("Juan Peñanieto");
        voletoSolidario1.getPasajero().setCi(4596210);
        voletoSolidario1.crear();

        VoletoSolidario voletoSolidario2= new CreatorVoletoSolidario().create();
        voletoSolidario2.setNumeroAsiento("53-B");
        voletoSolidario2.getPasajero().setNombre("Liliana Peñanieto");
        voletoSolidario2.getPasajero().setCi(4209784);
        voletoSolidario2.crear();

        VoletoInfantes voletoInfantes1 = new CreatorVoletoInfantes().create();
        voletoInfantes1.setNumeroAsiento("200-D");
        voletoInfantes1.getPasajero().setCi(10023568);
        voletoInfantes1.getPasajero().setNombre("Luigi Ramirez");
        voletoInfantes1.getPasajero().setFechaNacimiento("20 de enero de 2015");
        voletoInfantes1.crear();

        VoletoInfantes voletoInfantes2 = new CreatorVoletoInfantes().create();
        voletoInfantes2.setNumeroAsiento("200-B");
        voletoInfantes2.getPasajero().setCi(1836147);
        voletoInfantes2.getPasajero().setNombre("Mateo Ramirez");
        voletoInfantes2.getPasajero().setFechaNacimiento("12 de enero de 2011");
        voletoInfantes2.crear();
    }

}
