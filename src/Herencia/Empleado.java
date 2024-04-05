package Herencia;


public class Empleado extends Persona {
    private double sueldo;

    public Empleado(double sueldo, String nombre, String apellido, String documento, int codigo) {
        super(nombre, apellido, documento, codigo);
        this.sueldo = sueldo;
    }
    public String mostrasEmpleado(){
        return getNombre() + "Apellido\n" + getApellido() + "Documento\n" + getDocumento() + "Sueldo" + sueldo;
    }
}
