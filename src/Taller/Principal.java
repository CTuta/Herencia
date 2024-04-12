package Taller;
import javax.swing.JOptionPane;

public class Principal {
    

    public static void main(String[] args) {
      int  opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion \n"
              + " 1: Agregar Empleado \n"
              + " 2: Agregar Cliente \n"
              + " 3: Salir"));
            
    switch(opcion){
        case 1:
    String nombreEmp= JOptionPane.showInputDialog("Ingrese nombre de empleado");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
         Empleado emp = new Empleado(salario,nombreEmp,edad);
       emp.mostrarEmpleado();
         break;
        case 2:
    String nombreCl = JOptionPane.showInputDialog("Ingrese nombre del cliente");
    int edadCl = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
    String direccion =JOptionPane.showInputDialog("Ingrese la direccion del cliente");
         Cliente cl = new Cliente(direccion,nombreCl,edadCl);
         cl.mostrarCliente();
         break;
         
        case 3:
            break;
    }
}
}
