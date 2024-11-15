package Clase11.Actividad1;

public class Tablero {
    private int[] tablero;
    private int n;
    
    // Constructor que inicializa el tablero con un tamaño n
    public Tablero(int n) {
        this.n = n;
        this.tablero = new int[n];
    }

    // Función de Backtracking para colocar las reinas
    public void colocarReinas(int fila) {
        if (fila == 2) {
            // Si hemos colocado las dos reinas (n=2), imprimimos la solución
            Solucion.imprimirSolucion(tablero);
            return;
        }

        // Probamos todas las columnas para la fila actual
        for (int columna = 0; columna < n; columna++) {
            // Verificamos si la colocación es válida
            if (esValido(fila, columna)) {
                // Colocamos la reina en la posición (fila, columna)
                tablero[fila] = columna;
                
                // Llamamos recursivamente para colocar la siguiente reina
                colocarReinas(fila + 1);
            }
        }
    }

    // Verifica si es válido colocar una reina en la fila y columna dadas
    private boolean esValido(int fila, int columna) {
        // Verificar las reinas previamente colocadas
        for (int i = 0; i < fila; i++) {
            // Verifica si las reinas están en la misma columna o en la misma diagonal
            if (tablero[i] == columna || Math.abs(tablero[i] - columna) == Math.abs(i - fila)) {
                return false;
            }
        }
        return true;
    }
}
