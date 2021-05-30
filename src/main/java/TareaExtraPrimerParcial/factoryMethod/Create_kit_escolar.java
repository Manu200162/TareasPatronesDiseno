package TareaExtraPrimerParcial.factoryMethod;

public class Create_kit_escolar extends CreatorKits{
    @Override
    public IKit creator() {
        Mochila mochila =new Mochila();
        mochila.setNumeroBolsillos(6);
        mochila.setTamanio("Mediano");

        Deportivo deportivo =new Deportivo();
        deportivo.setColor("Azul");
        deportivo.setTalla("L");
        deportivo.setNumveroPrendas(5);

        Cuadernos cuadernos=new Cuadernos();
        cuadernos.setTipo("Empasto tamaño carta");
        cuadernos.setNumeroHojas(100);

        Kit_escolar kit_escolar=new Kit_escolar();
        kit_escolar.setMochila(mochila);
        kit_escolar.setDeportivo(deportivo);
        kit_escolar.setCuadernos(cuadernos);

        return kit_escolar;
    }

}
