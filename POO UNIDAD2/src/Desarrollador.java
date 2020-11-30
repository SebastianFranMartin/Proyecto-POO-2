public class Desarrollador extends Trabajador
{
    public Desarrollador(String rut, String nombre, int sueldo, String juego, Departamento departamento)
    {
        super(rut, nombre, sueldo, juego, departamento);

        if(Math.round(Math.random()) == 0)
        {
            actividadActual = "Programando funcionalidades del videojuego.";
        }
        else
        {
            actividadActual = "Programando objetos.";
        }
    }
}
