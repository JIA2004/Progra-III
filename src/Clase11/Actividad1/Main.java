public class Main {

    public static void main(String[] args) {
        // Crear un objeto de la clase Tablero con un tamaño de 4x4
        int n = 4;
        Tablero tablero = new Tablero(n);
        
        // Llamamos a la función de backtracking para encontrar todas las soluciones
        tablero.colocarReinas(0);
    }
}
