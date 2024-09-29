package clase5.Actividad4;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Dijkstra {

    public static int[] dijkstra(Grafo grafo, int origen) {
        int numVertices = grafo.numVertices;
        int[] dist = new int[numVertices]; // Array de distancias mínimas
        boolean[] procesado = new boolean[numVertices]; // Array que marca los vertices ya procesados
        int[] prev = new int[numVertices]; 
       
        // Inicializamos todas las distancias a infinito y marcamos todos los vértices como no procesados
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[origen] = 0;

        // Creamos cola con prioridad
        PriorityQueue<Nodo> Q = new PriorityQueue<>(Comparator.comparingInt(n -> n.distancia));
        Q.add(new Nodo(origen, 0)); // agrega vertice de origen con distancia 0

        while (!Q.isEmpty()) {
            Nodo nodoActual = Q.poll();
            int u = nodoActual.vertice;

            
            if (procesado[u]) continue;

            procesado[u] = true; // Marca vertice como procesado

            
            for (int v = 0; v < numVertices; v++) {
                if (grafo.matrizAdyacencia[u][v] != Integer.MAX_VALUE && !procesado[v]) {
                    int alt = dist[u] + grafo.matrizAdyacencia[u][v];

                    if (alt < dist[v]) {
                        dist[v] = alt; 
                        prev[v] = u; 
                        Q.add(new Nodo(v, dist[v])); 
                    }
                }
            }
        }

        return dist; // Que devuelva el array con las distancias mínimas
    }

    // Clase nodo para cola con prioridad
    static class Nodo {
        int vertice;
        int distancia;

        public Nodo(int vertice, int distancia) {
            this.vertice = vertice;
            this.distancia = distancia;
        }
    }
}

