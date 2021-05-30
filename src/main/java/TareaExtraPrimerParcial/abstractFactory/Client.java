package TareaExtraPrimerParcial.abstractFactory;

public class Client {
    public static void main(String[] args){

        FactoryMateria.make(FactoryMateria.materia.MATEMATICAS).
                InscribirEstudiante("Juan lopez","78952456");

        FactoryMateria.make(FactoryMateria.materia.LENGUAJE).
                InscribirEstudiante("Pedro Fernandez","69452345");

        FactoryMateria.make(FactoryMateria.materia.HISTORIA).
                InscribirEstudiante("Lucia Mendez","58642301");

        FactoryMateria.make(FactoryMateria.materia.INGLES).
                InscribirEstudiante("Jose Torrez","74300214");

        FactoryMateria.make(FactoryMateria.materia.MATEMATICAS).
                InscribirEstudiante("Ana Maldonado","78315648");

    }


}
