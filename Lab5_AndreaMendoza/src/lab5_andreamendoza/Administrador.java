package lab5_andreamendoza;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Empleados {
  private ArrayList <Empleados> E;  

    public Administrador(ArrayList<Empleados> E) {
        this.E = E;
    }

    public Administrador(ArrayList<Empleados> E, String nombre, Date fecha, String usuario, String pw, String email, String puesto) {
        super(nombre, fecha, usuario, pw, email, puesto);
        this.E = E;
    }

    public ArrayList<Empleados> getE() {
        return E;
    }

    public void setE(ArrayList<Empleados> E) {
        this.E = E;
    }
  
}
