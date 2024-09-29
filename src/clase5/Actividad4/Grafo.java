package clase5.Actividad4;

public class Grafo {
    int numVertices;
    int[][] matrizAdyacencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        matrizAdyacencia = new int[numVertices][numVertices];

        
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i == j) {
                    matrizAdyacencia[i][j] = 0; // Distancia a sí mismo es 0
                } else {
                    matrizAdyacencia[i][j] = Integer.MAX_VALUE; // Inicializamos las distancias a infinito
                }
            }
        }
    }

    
public void agregarArista(int origen, int destino, int peso) {
    matrizAdyacencia[origen][destino] = peso; // Grafo dirigido
}

}

