package TareaExtraPrimerParcial.abstractFactory;

public class Historia implements IMateria {
    @Override
    public void InscribirEstudiante(String nombreEstudiante, String ci) {
        System.out.println("El estudiante "+nombreEstudiante+" con el ci # "+ci+" se inscribio a la materia de Historia");
    }
}
