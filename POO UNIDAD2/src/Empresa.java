import java.util.ArrayList;
import java.util.Scanner;

public class Empresa
{
    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private Departamento[] departamentos;
    private ArrayList<Trabajador> listaDeTrabajadores;
    private Scanner scan;

    //CONSTRUCTOR
    public Empresa()
    {
        scan = new Scanner(System.in);

        nombre = "";
        direccion = "";
        departamentos = new Departamento[2];
        listaDeTrabajadores = new ArrayList<Trabajador>();

        departamentos[0] = new Departamento("Producción", (short)4, "Encargado de la creación de videojuegos como tal.");
        departamentos[1] = new Departamento("Publicidad y Marketing", (short)3, "Encargado de la promoción de los juegos de la empresa.");

        listaDeTrabajadores.add(new Trabajador("17.392.221-0", "Antonio",   250000, "Juego 1"));
        listaDeTrabajadores.add(new Trabajador("16.992.409-2", "Camila",    300000, "Juego 2"));
        listaDeTrabajadores.add(new Trabajador("15.398.923-7", "Horacio",   350000, "Juego 1"));
        listaDeTrabajadores.add(new Trabajador("14.419.656-K", "Esmeralda", 400000, "Juego 2"));
        listaDeTrabajadores.add(new Trabajador("13.033.461-1", "Waldo",     450000, "Juego 1"));

            /*
            for(byte i = 0;i<5;i++)
            {
                Trabajador a = listaDeTrabajadores.get(i);
                System.out.println(a.rut + ", " + a.nombre + ", " + a.sueldo + ", " + a.juego);
            }
            */
    }

    //GETTERS
    public String getNombre()                               {return nombre;}
    public String getDireccion()                            {return direccion;}
    public Departamento[] getDepartamentos()                {return departamentos;}
    public ArrayList<Trabajador> getListaDeTrabajadores()   {return listaDeTrabajadores;}

    //SETTERS
    public void setNombre(String nombre)                                            {this.nombre = nombre;}
    public void setDireccion(String direccion)                                      {this.direccion = direccion;}
    public void setDepartamentos(Departamento[] departamentos)                      {this.departamentos = departamentos;}
    public void setListaDeTrabajadores(ArrayList<Trabajador> listaDeTrabajadores)   {this.listaDeTrabajadores = listaDeTrabajadores;}

    //MÉTODOS GENERALES

    public void crearTrabajador()
    {

    }

    public void buscarTrabajador()
    {
        int detener=1;
        do {
            int valorError = 1;
            System.out.println("Ingrese el rut del trabajador a buscar:");
            String buscarRut = scan.nextLine();

            for (int x = 0; x < listaDeTrabajadores.size(); x++) {
                if (getListaDeTrabajadores().get(x).rut.equals(buscarRut)) {
                    System.out.println("//////////////////////////////////////////////////////////////");
                    System.out.println("Nombre: " + getListaDeTrabajadores().get(x).nombre);
                    System.out.println("Rut: " + getListaDeTrabajadores().get(x).rut);
                    System.out.println("Sueldo: " + getListaDeTrabajadores().get(x).sueldo);
                    System.out.println("Juego en el que trabaja: " + getListaDeTrabajadores().get(x).juego);
                    System.out.println("Actividad actual:" + getListaDeTrabajadores().get(x).actividadActual);
                    System.out.println("//////////////////////////////////////////////////////////////" + "\n");
                    x = listaDeTrabajadores.size();
                } else if (valorError >= listaDeTrabajadores.size()) {
                    System.out.println("El rut del trabajador ingresado no existe\n");
                } else {
                    valorError += 1;
                    //System.out.println("el valor de error es:"+valorError);
                    //System.out.println("el valor de largo es: "+listaDeTrabajadores.size());
                }
            }

            do {
                System.out.println("¿Desea buscar a otro trabajador? \n 1) Sí\n 2) No\n Ingrese el número de la opción a realizar");
                detener = scan.nextInt();
                if(detener!=1 && detener!=2){
                    System.out.println("INGRESE UNO DE LOS NUMEROS MOSTRADOS ANTERIORMENTE");
                }
            }while(detener!=1 && detener!=2);

            scan.nextLine(); //limpiar barra
        }while(detener !=2);

    }

    public void aumentarSueldo()
    {

    }

    public void cambiarSueldo()
    {

    }

    public void verTrabajadores()
    {

    }

    public void verActividad()
    {

    }
}
