import java.util.ArrayList;

public class Empresa
{
    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private Departamento[] departamentos;
    private ArrayList<Trabajador> listaDeTrabajadores;

    //CONSTRUCTOR
    public Empresa()
    {
        nombre = "";
        direccion = "";
        departamentos = new Departamento[2];
        listaDeTrabajadores = new ArrayList<Trabajador>();
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
