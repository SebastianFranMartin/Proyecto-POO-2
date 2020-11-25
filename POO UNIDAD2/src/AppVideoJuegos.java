import java.util.Scanner;

public class AppVideoJuegos
{
    private static Scanner scan;

    public static void main(String[] ags)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("///// MENÚ DE OPERACIONES /////");
        System.out.println("1. CREAR TRABAJADOR\n" +
                "2. BUSCAR TRABAJADOR\n" +
                "3. AUMENTAR SUELDO TRABAJADOR\n" +
                "4. CAMBIAR SUELDO TRABAJADOR\n" +
                "5. VER TRABAJADORES\n" +
                "6. VER LA ACTIVIDAD DE UN TRABAJADOR EN PARTICULAR\n" +
                "7. SALIR\n");
        System.out.println("seleccione una opción escribiendo el número de la operación a realizar");
        int seleccion = scan.nextInt();

    }
}
