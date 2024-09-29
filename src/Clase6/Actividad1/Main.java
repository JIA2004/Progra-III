package Clase6.Actividad1;

public class Main {
    public static void main(String[] args) {
        // Definir los objetos
        Objeto[] objetos = {
            new Objeto(3, 4), // Objeto 1
            new Objeto(4, 5), // Objeto 2
            new Objeto(2, 3)  // Objeto 3
        };

        int capacidadMochila = 6;

        // Solución por fuerza bruta
        int valorMaxFuerzaBruta = MochilaFuerzaBruta.maximoValor(objetos, capacidadMochila);
        System.out.println("Valor máximo con Fuerza Bruta: " + valorMaxFuerzaBruta);

        // Solución por programación dinámica
        int valorMaxProgDinamica = MochilaPrograDinamica.maximoValor(objetos, capacidadMochila);
        System.out.println("Valor máximo con Programación Dinámica: " + valorMaxProgDinamica);
    }

}
