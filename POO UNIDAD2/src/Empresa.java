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

        listaDeTrabajadores.add(new Trabajador("17.392.221-0", "Antonio",   250000, "Juego 1", departamentos[0]));
        listaDeTrabajadores.add(new Trabajador("16.992.409-2", "Camila",    300000, "Juego 2", departamentos[0]));
        listaDeTrabajadores.add(new Trabajador("15.398.923-7", "Horacio",   350000, "Juego 1", departamentos[0]));
        listaDeTrabajadores.add(new Trabajador("14.419.656-K", "Esmeralda", 400000, "Juego 2", departamentos[1]));
        listaDeTrabajadores.add(new Trabajador("13.033.461-1", "Waldo",     450000, "Juego 1", departamentos[1]));

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
        Trabajador trabajador;
        String rut;
        String nombre;
        int sueldo;
        String juego;
        Departamento departamento;
        byte oficio; String oficioStr;

        String entrada;
        boolean validez;
        String mensajeDeError = "NO VÁLIDO. Intente de nuevo.";

        System.out.println("Ingrese los datos del nuevo trabajador.");

        rut = verificarRut();

        System.out.println("Nombre:");
        nombre = scan.nextLine();

        sueldo = verificarSueldo();

        System.out.println("Juego en que trabaja:");
        juego = scan.nextLine();

        departamento = verificarDepartamento();

        oficio = verificarOficio();

        switch(oficio)
        {
            case 1: oficioStr = "Desarrollador";
                break;

            case 2: oficioStr = "Diseñador";
                break;

            default: oficioStr = "Publicista";
        }

        System.out.println(nombre);
        System.out.println(rut);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Juego: " + juego);
        System.out.println("Departamento de " + departamento.getNombre());
        System.out.println(oficioStr);

        do
        {
            validez = true;

            System.out.println("¿Es correcta esta información?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            entrada = scan.nextLine();

            switch(entrada)
            {
                case "1": switch(oficio)
                          {
                              case 1: trabajador = new Desarrollador(rut, nombre, sueldo, juego, departamento);
                                      break;

                              case 2: trabajador = new Diseniador(rut, nombre, sueldo, juego, departamento);
                                      break;

                              default: trabajador = new Publicista(rut, nombre, sueldo, juego, departamento);
                          }
                          listaDeTrabajadores.add(trabajador);
                          System.out.println("SE AÑADIÓ AL TRABAJADOR EXITOSAMENTE");

                case "2": System.out.println("No se pudo añadir al trabajador.");
                          break;

                default: validez = false;
                         System.out.println(mensajeDeError);
            }
        }while(!validez);

        System.out.println("Presione enter para continuar");
        scan.nextLine();
    }
    public String verificarRut()
    {
        String entrada;
        String rut = null, ult, penult, antepen;
        short largo;
        boolean validez, preValidez = false;
        String mensajeDeError = "NO VÁLIDO. Intente de nuevo.";

        do
        {
            validez = true;
            ult = "";
            penult = "";
            antepen = "";

            System.out.println("RUT sin puntos, con guión y dígito verificador:");
            entrada = scan.nextLine();
            largo = (short)entrada.length();

            if(largo < 3)
            {
                validez = false;
                System.out.println(mensajeDeError);
                continue;
            }

            if(largo > 10  ||  entrada.charAt(largo - 2) != (char)45)
            {
                validez = false;
                System.out.println(mensajeDeError);
                continue;
            }

            byte inicio = (byte)(largo-1);
            for(byte i = inicio;i>=0;i--)
            {
                if(i == inicio - 4)
                {
                    ult = entrada.substring(i);
                }
                else if(i == inicio - 7)
                {
                    penult = entrada.substring(i, i + 3).concat(".");
                }
            }
            if(ult.isEmpty())
            {
                ult = entrada;
            }
            else if(penult.isEmpty())
            {
                if(inicio - 4 != 0)
                {
                    penult = entrada.substring(0, inicio - 4).concat(".");
                }
            }
            else if(inicio - 7 != 0)
            {
                antepen = entrada.substring(0, inicio - 7).concat(".");
            }
            rut = antepen.concat(penult.concat(ult));
            for(byte i = 0;i<listaDeTrabajadores.size();i++)
            {
                if(rut.equals(listaDeTrabajadores.get(i).getRut()))
                {
                    System.out.println("ES FAAALSO");
                    validez = false;
                    break;
                }
            }
            if(!validez)
            {
                System.out.println("ESTE RUT YA HA SIDO INGRESADO. Intente nuevamente.");
                continue;
            }

            for(byte i = 0;i<largo;i++)
            {
                for(byte j = 0;j<10;j++)
                {
                    preValidez = false;
                    if(entrada.charAt(i) == String.valueOf(j).charAt(0)  ||  i == (largo - 2))
                    {
                        preValidez = true;
                        break;
                    }
                }
                if(!preValidez  &&  !(i == largo - 1  &&  (entrada.charAt(i) == 'k'  ||  entrada.charAt(i) == 'K')))
                {
                    validez = false;
                    System.out.println(mensajeDeError);
                    break;
                }
            }
        }while(!validez);

        return rut;
    }
    public int verificarSueldo()
    {
        int sueldo;
        String entrada;
        boolean validez;
        String mensajeDeError = "NO VÁLIDO. Intente de nuevo.";

        do
        {
            validez = true;

            System.out.print("Sueldo:\nMÍNIMO: 200000\nMÁXIMO: 500000\n");
            entrada = scan.nextLine();
            if(entrada.length() != 6  ||  entrada.charAt(0) == '0')
            {
                validez = false;
                System.out.println(mensajeDeError);
                continue;
            }

            for(short i = 0;i<entrada.length();i++)
            {
                if(Character.isDigit(entrada.charAt(i)))
                {
                    validez = false;
                    break;
                }
            }

        }while(!validez);

        sueldo = Integer.parseInt(entrada);

        return sueldo;
    }
    public Departamento verificarDepartamento()
    {
        Departamento departamento = null;
        String entrada;
        boolean validez;
        String mensajeDeError = "NO VÁLIDO. Intente de nuevo.";

        do
        {
            validez = true;

            System.out.println("Departamento al que pertenece:");
            System.out.println("1. Producción");
            System.out.println("2. Publicidad y Marketing");
            entrada = scan.nextLine();

            switch(entrada)
            {
                case "1": departamento = departamentos[0];
                          break;

                case "2": departamento = departamentos[1];
                          break;

                default: validez = false;
                         System.out.println(mensajeDeError);
            }
        }while(!validez);

        return departamento;
    }
    public byte verificarOficio()
    {
        byte oficio = 0;
        String entrada;
        boolean validez;
        String mensajeDeError = "NO VÁLIDO. Intente de nuevo.";

        do
        {
            validez = true;

            System.out.println("Oficio:");
            System.out.println("1. Desarrollador");
            System.out.println("2. Diseñador");
            System.out.println("3. Publicista");
            entrada = scan.nextLine();

            if(entrada.equals("1")  ||  entrada.equals("2")  ||  entrada.equals("3"))
            {
                oficio = Byte.parseByte(entrada);
            }
            else
            {
                validez = false;
                System.out.println(mensajeDeError);
            }
        }while(!validez);

        return oficio;
    }

    public void buscarTrabajador()
    {

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
