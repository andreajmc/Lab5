package lab5_andreamendoza;

import java.util.Date;

public class Empleados {
protected String nombre;
protected Date fecha;
protected String usuario;
protected String pw;
protected String email;
protected String puesto;

    public Empleados() {
    }

    public Empleados(String nombre, Date fecha, String usuario, String pw, String email, String puesto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.usuario = usuario;
        this.pw = pw;
        this.email = email;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return nombre;
    }


}
