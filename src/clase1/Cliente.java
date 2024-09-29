package Clase1;

public class Cliente {
    int codigo;
    String nombre;
    
    public Cliente(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public int getId() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
}
