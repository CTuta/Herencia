package Herencia;


public class Cliente extends Persona{
    private String categoria;
    public Cliente(String nombre, String apellido, String documento, int codigo) {
        super(nombre, apellido, documento, codigo);
        this.categoria = categoria;
    }
    
    public String msotrarDatos(){
        return getNombre()+ "Apellido\n"+ getApellido()+"Documento\n" + getDocumento()+ "Categoria"+categoria;
    }
    
}
