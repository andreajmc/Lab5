package lab5_andreamendoza;
public class Aseo {
private String nombre;    
private String descripcion;   
private String funcion;

    public Aseo(String nombre, String descripcion, String funcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }


}
