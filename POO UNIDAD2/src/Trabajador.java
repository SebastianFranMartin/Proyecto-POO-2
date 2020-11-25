public class Trabajador {

    protected String rut;
    protected String nombre;
    protected int sueldo;
    protected String juego;
    protected String actividadActual;

    //CONSTRUCTOR
    public Trabajador(){

        this.rut="";
        this.nombre="";
        this.sueldo=0;
        this.juego="";
        this.actividadActual="nada";
    }
    //SELECTORES
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public int getSueldo() {
        return sueldo;
    }
    public String getJuego() {
        return juego;
    }
    public String getActividadActual() {
        return actividadActual;
    }
    //MUTADORES
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public void setJuego(String juego) {
        this.juego = juego;
    }
    public void setActividadActual(String actividadActual) {
        this.actividadActual = actividadActual;
    }
}
