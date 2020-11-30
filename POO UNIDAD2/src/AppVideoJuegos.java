// INTEGRANTES: ÁLVARO VILLALOBOS 20.759.787-2  SEBASTIAN MARTIN 20.731.273-8 FECHA: 30/11/2020
// ESTE PROGRAMA SE EJECUTA POR CONSOLA INGRESANDO LOS VALORES QUE PIDE EL PROGRAMA. PARA SU EJECUCIÓN SE NECESITAN LAS CLASES: AppVideoJuegos, Empresa, Departamento, Desarrollador,
// Diseniador, Publicista y Trabajador. EL PROGRAMA DEBERÍA FUNCIONAR CORRECTAMENTE Y LOS ELEMENTOS ENTREGADOS DEBERÍAN SER UNA CARPETA DENTRO DE UN ARCHIVO RAR LLAMADO "AlvaroVillalobosUnidad2" o "SebastianMartinUnidad2"
// LA FUNCIÓN DE ESTE PROGRAMA ES LA EJECUCIÓN DE UN MENÚ DE OPERACIONES PARA UNA EMPRESA QUE DESEA ALMACCENAR, REVISAR Y CAMBIAR INFORMACIÓN DE SUS TRABAJADORES, TALES COMO SU SUELDO Y EL AUMENTO DE ESTE, TRABAJO, DEPARTAMENTO, ETC.
// LAS OPCIONES QUE DA EL PROGRAMA AL USUARIO DEBERÁN SER RESPONDIDAS ESCRIBIENDO EL NÚMERO DE LA ACCIÓN QUE USTED DESEE REALIZAR.
import java.util.Scanner;

public class AppVideoJuegos
{
    public static void main(String[] ags) {
        Empresa emp = new Empresa(); //OBJETO EMPRESA CREADO
        Scanner scan = new Scanner(System.in); // ELEMENTO ESCANER
        boolean enUso = true; // BOLEANO QUE PERMITE LA INTERACCIÓN EL EL SWITCH A CONTINUACIÓN

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

            switch(seleccion) //DEPENDIENDO DE LA ELECCIÓN DEL USUARIO SE EJECUTARÁ UN MÉTODO QUE SE UBICA EN LA CLASE "Empresa"
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

                case "7": enUso = false; //PERMITE TERMINAR EL CILCO WHILE Y TERMINAR CON EL EJECUCIÓN DE ESTE PROGRAMA
                          break;

                default:
            }
        }while(enUso); //PERMITE QUE EL PROGRAMA SIEMPRE SE ESTÉ EJECUTANDO PARA REALIZAR TODAS LAS OPCIONES QUE EL USUARIO DESEE REALIZAR
    }
}
