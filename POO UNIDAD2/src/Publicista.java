public class Publicista extends Trabajador
{
    public Publicista(String rut, String nombre, int sueldo, String juego, Departamento departamento)
    {
        super(rut, nombre, sueldo, juego, departamento);

        actividadActual = "Preparándose para la fecha de lanzamiento del videojuego."; //ACCION QUE REALIZARÁ UN PUBLICISTA
    }
}
