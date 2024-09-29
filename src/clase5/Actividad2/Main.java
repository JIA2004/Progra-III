package Clase5.Actividad2;

public class Main {
    public static void main(String[] args) {
        // Crear un grafo con 5 vértices
        GrafoMatriz grafo = new GrafoMatriz(3);

        // Agregar algunas aristas
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);

        // Imprimir la matriz de adyacencia
        System.out.println("Matriz de adyacencia:");
        grafo.imprimirMatriz();

        // Verificar si existe una arista
        System.out.println("\nVerificar si existe una arista entre 0 y 1: " + grafo.verificarArista(0, 1));
        System.out.println("Verificar si existe una arista entre 1 y 3: " + grafo.verificarArista(1, 3));

        // Listar los vértices adyacentes a un vértice dado
        System.out.println("\nVértices adyacentes a 0:");
        grafo.listarAdyacentes(0);

        System.out.println("\nVértices adyacentes a 2:");
        grafo.listarAdyacentes(2);

        // Contar grado de entrada y salida
        System.out.println("\nGrado de salida del vértice 0: " + grafo.contarGradoSalida(0));
        System.out.println("Grado de entrada del vértice 2: " + grafo.contarGradoEntrada(2));

        // Eliminar una arista
        grafo.eliminarArista(0, 1);
        System.out.println("\nMatriz de adyacencia después de eliminar la arista entre 0 y 1:");
        grafo.imprimirMatriz();

        // Verificar si existe la arista después de eliminarla
        System.out.println("\nVerificar si existe una arista entre 0 y 1 después de eliminarla: " + grafo.verificarArista(0, 1));
    }
}
