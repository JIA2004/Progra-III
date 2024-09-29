package Clase6.Actividad2;

public class Main {
    public static void main(String[] args) {
        // Definir los objetos
        Objeto[] objetos = {
            new Objeto(2, 4), // Objeto 1
            new Objeto(5, 2), // Objeto 2
            new Objeto(6, 1),  // Objeto 3
            new Objeto(7,6)     //Objeto 4
        };

        int capacidadMochila = 10;

        // Solución por fuerza bruta
        int valorMaxFuerzaBruta = MochilaFuerzaBruta.maximoValor(objetos, capacidadMochila);
        System.out.println("Valor máximo con Fuerza Bruta: " + valorMaxFuerzaBruta);

        // Solución por programación dinámica
        int valorMaxProgDinamica = MochilaPrograDinamica.maximoValor(objetos, capacidadMochila);
        System.out.println("Valor máximo con Programación Dinámica: " + valorMaxProgDinamica);
    }

}