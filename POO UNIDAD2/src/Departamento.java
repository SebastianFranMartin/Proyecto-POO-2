public class Departamento {
    private String nombre;
    private Short numOficina;
    private String descripcion;

    public Departamento(String nombre, Short numOficina, String descripcion){
        this.nombre=nombre;
        this.numOficina=numOficina;
        this.descripcion=descripcion;

    }

    public String getNombre() {
        return nombre;
    }
    public Short getNumOficina() {
        return numOficina;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumOficina(Short numOficina) {
        this.numOficina = numOficina;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
