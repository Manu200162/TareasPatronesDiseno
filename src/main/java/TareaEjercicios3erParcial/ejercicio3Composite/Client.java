package TareaEjercicios3erParcial.ejercicio3Composite;

public class Client {
    public static void main(String[] args){

        CompositeArchivo folder1 = new CompositeArchivo("folder1");
        String text1=" tiene muchas palabras";
        String text2=" Las palabras en este string son 7";
        String text3=" Solo tres palbras";
        String text4=" un string que tiene muchas palabras";
        String text5=" No necesita tener muchas palabras";
        folder1.add(new ArchivoSimple("archivo","Archivo1",text1,"5kb"));
        folder1.add(new ArchivoSimple("archivo","Archivo2",text2,"5kb"));
        folder1.add(new ArchivoSimple("archivo","Archivo3",text3,"5kb"));
        folder1.add(new ArchivoSimple("archivo","Archivo4",text4,"5kb"));
        folder1.add(new ArchivoSimple("archivo","Archivo5",text5,"5kb"));

        CompositeArchivo folder2 = new CompositeArchivo("folder2");
        String text6=" Este es un texto de prueba";
        String text7=" Este es un texto de prueba prueba ";
        String text8=" Este es un texto de";
        String text9=" Este es un texto  prueba texto prueba";
        String text10=" Este es";

        folder2.add(new ArchivoSimple("archivo","Archivo6",text6,"5kb"));
        folder2.add(new ArchivoSimple("archivo","Archivo7",text7,"5kb"));
        folder2.add(new ArchivoSimple("archivo","Archivo8",text8,"5kb"));
        folder2.add(new ArchivoSimple("archivo","Archivo9",text9,"5kb"));
        folder2.add(new ArchivoSimple("archivo","Archivo10",text10,"5kb"));

        CompositeArchivo unidadDeDisco= new CompositeArchivo("unidadDeDisco");
        unidadDeDisco.add(folder1);
        unidadDeDisco.add(folder2);

        unidadDeDisco.operation();





    }
}
