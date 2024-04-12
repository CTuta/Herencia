
package Taller;

import javax.swing.JOptionPane;


public class Cliente extends Persona{
    private String direccion;

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
    }
    public void mostrarCliente(){
        JOptionPane.showMessageDialog(null,"El nombre del empleado es: "+nombre
                +"\nLa edad del empleado es: "+edad
                +"\nEl salario del empleado es: "+direccion);        
    }
}
