package TareaExtraPrimerParcial.abstractFactory;

public class FactoryMateria {

    public enum materia {
        MATEMATICAS, LENGUAJE, INGLES, HISTORIA
    }

    public static IMateria make(materia fm){
        IMateria materia;
        switch (fm){
            case MATEMATICAS:
                materia = new Matematicas();
                break;
            case LENGUAJE:
                materia= new Lenguaje();
                break;
            case INGLES:
                materia= new Ingles();
                break;
            case HISTORIA:
                materia= new Historia();
                break;
            default:
                materia= new Lenguaje();
                break;
        }
        return materia;
    }
}
