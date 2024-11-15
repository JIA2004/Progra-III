package Clase11.Actividad1;

public class Solucion {

    // Imprime la solución de las reinas en el tablero
    public static void imprimirSolucion(int[] tablero) {
        System.out.println("Solución:");
        char[][] solucion = new char[4][4];

        // Llenamos el tablero con espacios vacíos
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                solucion[i][j] = '.';
            }
        }

        // Colocamos las reinas en las posiciones indicadas por el arreglo `tablero`
        for (int i = 0; i < 2; i++) {
            int columna = tablero[i];
            solucion[i][columna] = 'R';  // 'R' representa la reina
        }

        // Imprimimos el tablero
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(solucion[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
