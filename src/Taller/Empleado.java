
package Taller;

import javax.swing.JOptionPane;


public class Empleado extends Persona {
    private double salario;

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }
    
    public void mostrarEmpleado(){
        JOptionPane.showMessageDialog(null,"El nombre del empleado es: "+nombre
                +"\nLa edad del empleado es: "+edad
                +"\nEl salario del empleado es: "+salario);        
}

}
