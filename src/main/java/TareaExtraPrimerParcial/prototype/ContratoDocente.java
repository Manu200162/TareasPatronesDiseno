package TareaExtraPrimerParcial.prototype;

public class ContratoDocente implements IContrato{

    private int     sueldo;
    private int     carga_horaria;
    private boolean curso_educacion_superior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String  marcado_hora_entrada;
    private String  marcado_hora_salida;
    private Docente docente;

    public ContratoDocente(){}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public boolean isCurso_educacion_superior() {
        return curso_educacion_superior;
    }

    public void setCurso_educacion_superior(boolean curso_educacion_superior) {
        this.curso_educacion_superior = curso_educacion_superior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcado_hora_entrada() {
        return marcado_hora_entrada;
    }

    public void setMarcado_hora_entrada(String marcado_hora_entrada) {
        this.marcado_hora_entrada = marcado_hora_entrada;
    }

    public String getMarcado_hora_salida() {
        return marcado_hora_salida;
    }

    public void setMarcado_hora_salida(String marcado_hora_salida) {
        this.marcado_hora_salida = marcado_hora_salida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public Object clone() {
        ContratoDocente objClonable= new ContratoDocente();
        objClonable.setSueldo(this.sueldo);
        objClonable.setAccesoPlataforma(this.accesoPlataforma);
        objClonable.setCarga_horaria(this.carga_horaria);
        objClonable.setMarcado_hora_entrada(this.marcado_hora_entrada);
        objClonable.setMarcado_hora_salida(this.marcado_hora_salida);
        objClonable.setMarcadoBiometrico(this.marcadoBiometrico);
        objClonable.setCurso_educacion_superior(this.curso_educacion_superior);
        objClonable.setDocente(this.docente);
        return objClonable;
    }

    public void showInfo(){
        System.out.println("***************************************************");
        System.out.println("Docente nombre: "+docente.getNombre());
        System.out.println("Docente apellido: : "+docente.getApellido());
        System.out.println("Docente ci : "+docente.getCi());
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Carga horaria: "+carga_horaria);
        System.out.println("Curso educacion superior: "+curso_educacion_superior);
        System.out.println("Acceso plataforma: "+accesoPlataforma);
        System.out.println("Marcado biometrico: "+marcadoBiometrico);
        System.out.println("Marcado hora entrada: "+marcado_hora_entrada);
        System.out.println("Marcado hora salida: "+marcado_hora_salida);
        System.out.println("***************************************************");
    }
}
