import java.util.Scanner;

public class AppVideoJuegos
{
    private static Scanner scan;

    public static void main(String[] ags) {
        Empresa emp = new Empresa();
        Scanner scan = new Scanner(System.in);
        boolean enUso = true;

        System.out.println("Hola mundo");
        do
        {
            System.out.println("///// MENÚ DE OPERACIONES /////");
            System.out.println("1. CREAR TRABAJADOR\n" +
                    "2. BUSCAR TRABAJADOR\n" +
                    "3. AUMENTAR SUELDO TRABAJADOR\n" +
                    "4. CAMBIAR SUELDO TRABAJADOR\n" +
                    "5. VER TRABAJADORES\n" +
                    "6. VER LA ACTIVIDAD DE UN TRABAJADOR EN PARTICULAR\n" +
                    "7. SALIR\n");
            System.out.println("seleccione una opción escribiendo el número de la operación a realizar");
            String seleccion = scan.nextLine();

            switch(seleccion)
            {
                case "1": emp.crearTrabajador();
                          break;

                case "2": emp.buscarTrabajador();
                          break;

                case "3": emp.aumentarSueldo();
                          break;

                case "4": emp.cambiarSueldo();
                          break;

                case "5": emp.verTrabajadores();
                          break;

                case "6": emp.verActividad();
                          break;

                case "7": enUso = false;
                          break;

                default:
            }
        }while(enUso);
    }
}
