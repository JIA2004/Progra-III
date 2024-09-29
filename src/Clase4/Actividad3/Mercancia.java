package Clase4.Actividad3;
public class Mercancia {
    private String nombre;
    private double valor;
    private double peso;

    public Mercancia(String nombre, double valor, double peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    public double getPeso() {
        return peso;
    }

    public double getValorPorPeso() {
        return valor / peso;
    }
}
