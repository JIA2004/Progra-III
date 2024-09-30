package Clase5.Actividad2;

public class GrafoMatriz {

    private int[][] matrizAdyacencia;
    private int numVertices;

    // Constructor para inicializar el grafo con un número de vértices
    public GrafoMatriz(int numVertices) {
        this.numVertices = numVertices;
        matrizAdyacencia = new int[numVertices][numVertices]; // Matriz de adyacencia de tamaño n x n
    }

    // Método para agregar una arista desde el vértice 'origen' al vértice 'destino'
    public void agregarArista(int origen, int destino) {
        if (origen >= 0 && origen < numVertices && destino >= 0 && destino < numVertices) {
            matrizAdyacencia[origen][destino] = 1; // Se coloca un 1 para indicar que hay una arista
        } else {
            System.out.println("Vértices fuera de rango.");
        }
    }

    // Método para eliminar una arista
    public void eliminarArista(int origen, int destino) {
        if (origen >= 0 && origen < numVertices && destino >= 0 && destino < numVertices) {
            matrizAdyacencia[origen][destino] = 0; // Se coloca un 0 para indicar que se ha eliminado la arista
        } else {
            System.out.println("Vértices fuera de rango.");
        }
    }

    // Método para verificar si existe una arista entre dos vértices
    public boolean verificarArista(int origen, int destino) {
        if (origen >= 0 && origen < numVertices && destino >= 0 && destino < numVertices) {
            return matrizAdyacencia[origen][destino] == 1;
        } else {
            System.out.println("Vértices fuera de rango.");
            return false;
        }
    }

    // Método para listar los vértices adyacentes de un vértice
    public void listarAdyacentes(int vertice) {
        if (vertice >= 0 && vertice < numVertices) {
            System.out.print("Vértices adyacentes a " + vertice + ": ");
            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[vertice][i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Vértice fuera de rango.");
        }
    }

    // Método para contar el grado de salida de un vértice
    public int contarGradoSalida(int vertice) {
        int gradoSalida = 0;
        if (vertice >= 0 && vertice < numVertices) {
            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[vertice][i] == 1) {
                    gradoSalida++;
                }
            }
        } else {
            System.out.println("Vértice fuera de rango.");
        }
        return gradoSalida;
    }

    // Método para contar el grado de entrada de un vértice
    public int contarGradoEntrada(int vertice) {
        int gradoEntrada = 0;
        if (vertice >= 0 && vertice < numVertices) {
            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[i][vertice] == 1) {
                    gradoEntrada++;
                }
            }
        } else {
            System.out.println("Vértice fuera de rango.");
        }
        return gradoEntrada;
    }

    // Método para imprimir la matriz de adyacencia
    public void imprimirMatriz() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

}
