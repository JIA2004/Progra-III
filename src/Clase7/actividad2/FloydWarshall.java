package Clase7.actividad2;

public class FloydWarshall {
    final static int INF = 99999;  // valor grande que represente infinito
    
    public static void main(String[] args) {
        FloydWarshall fw = new FloydWarshall();
        // Grafo con 4 centros de distribución conectados por carreteras.
        int graph[][] = { 
            {0, 3, INF, 7},   
            {8, 0, 2, INF},   
            {5, INF, 0, 1},   
            {2, INF, INF, 0}  
        };
        
        int V = graph.length;  // cantidad centros de distribución
        fw.floydWarshall(graph, V);
    }

    
    void floydWarshall(int graph[][], int V) {
        int dist[][] = new int[V][V];

        
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Aplicamos Floyd-Warshall
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Verificamos si hay ciclos negativos
        for (int i = 0; i < V; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Ciclo negativo detectado en el sistema de rutas.");
                return;
            }
        }
        printSolution(dist, V);
    }

    // Imprimimos matriz de distancias mínimas
    void printSolution(int dist[][], int V) {
        System.out.println("Tiempos mínimos de entrega entre los centros de distribución:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

