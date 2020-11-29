public class Diseniador extends Trabajador
{
    public Diseniador(String rut, String nombre, int sueldo, String juego, Departamento departamento)
    {
        super(rut, nombre, sueldo, juego, departamento);

        actividadActual = "Creando sprites del videojuego.";
    }
}
