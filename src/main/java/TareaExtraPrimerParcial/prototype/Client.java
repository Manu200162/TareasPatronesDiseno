package TareaExtraPrimerParcial.prototype;

public class Client {
    public static void main (String []args){

        ContratoDocente cd= new ContratoDocente();
        cd.setSueldo(5000);
        cd.setCarga_horaria(80);
        cd.setCurso_educacion_superior(true);
        cd.setAccesoPlataforma(true);
        cd.setMarcadoBiometrico(false);
        cd.setMarcado_hora_entrada("08:00");
        cd.setMarcado_hora_salida("18:00");

        ContratoDocente c1 = (ContratoDocente) cd.clone();
        c1.setDocente(new Docente(45612378,"Luis","Perez"));
        ContratoDocente c2 = (ContratoDocente) cd.clone();
        c2.setDocente(new Docente(45602315,"Juan","Rodriguez"));
        ContratoDocente c3 = (ContratoDocente) cd.clone();
        c3.setDocente(new Docente(32659874,"Maria","Lopez"));
        ContratoDocente c4 = (ContratoDocente) cd.clone();
        c4.setDocente(new Docente(74365896,"Manuel","Sanchez"));
        ContratoDocente c5 = (ContratoDocente) cd.clone();
        c5.setDocente(new Docente(23015036,"Daniel","Vargas"));
        ContratoDocente c6 = (ContratoDocente) cd.clone();
        c6.setDocente(new Docente(40235698,"Luigi","Maldonado"));
        ContratoDocente c7 = (ContratoDocente) cd.clone();
        c7.setDocente(new Docente(73523654,"Jose","Mendez"));
        ContratoDocente c8 = (ContratoDocente) cd.clone();
        c8.setDocente(new Docente(63426581,"Luciana","Villanueva"));
        ContratoDocente c9 = (ContratoDocente) cd.clone();
        c9.setDocente(new Docente(25645874,"Christian","Perez"));
        ContratoDocente c10 = (ContratoDocente) cd.clone();
        c10.setDocente(new Docente(23546895,"Alejandro","Fernandez"));
        ContratoDocente c11 = (ContratoDocente) cd.clone();
        c11.setDocente(new Docente(22355689,"Pedro","Infante"));
        ContratoDocente c12 = (ContratoDocente) cd.clone();
        c12.setDocente(new Docente(86252543,"Juan","Torrez"));
        ContratoDocente c13 = (ContratoDocente) cd.clone();
        c13.setDocente(new Docente(30200145,"Miranda","Aneiva"));
        ContratoDocente c14 = (ContratoDocente) cd.clone();
        c14.setDocente(new Docente(22553366,"Lucas","Orozco"));
        ContratoDocente c15 = (ContratoDocente) cd.clone();
        c15.setDocente(new Docente(75345689,"Rene","Ulloa"));

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();
        c6.showInfo();
        c7.showInfo();
        c8.showInfo();
        c9.showInfo();
        c10.showInfo();
        c11.showInfo();
        c12.showInfo();
        c13.showInfo();
        c14.showInfo();
        c15.showInfo();
    }
}
