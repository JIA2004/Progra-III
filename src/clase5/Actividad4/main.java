package Clase5.Actividad4;

public class main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        
grafo.agregarArista(0, 1, 10);  // solo de 0 a 1
grafo.agregarArista(0, 2, 5);   // solo de 0 a 2
grafo.agregarArista(1, 2, 2);   // solo de 1 a 2 
grafo.agregarArista(1, 3, 1);   // solo de 1 a 3
grafo.agregarArista(2, 3, 9);   // solo de 2 a 3
grafo.agregarArista(2, 4, 3);   // solo de 2 a 4
grafo.agregarArista(3, 4, 4);   // solo de 3 a 4

        
        int[] distancias = Dijkstra.dijkstra(grafo, 0); 

        
        for (int i = 1; i < distancias.length; i++) {
            System.out.println("Tiempo mínimo desde el Centro 0 al Centro " + i + " es " + distancias[i] + " minutos.");
        }
    }
}
