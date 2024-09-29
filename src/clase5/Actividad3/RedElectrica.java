package Clase5.Actividad3;
import java.util.Arrays;

class RedElectrica {
    private Estacion[] estaciones;
    private int numEstaciones;

    public RedElectrica(int capacidad) {
        estaciones = new Estacion[capacidad];
        numEstaciones = 0;
    }

    public void agregarEstacion(Estacion estacion) {
        if (numEstaciones >= estaciones.length) {
            estaciones = Arrays.copyOf(estaciones, estaciones.length + 10);
        }
        estaciones[numEstaciones] = estacion;
        numEstaciones++;
    }

    public void aplicarAlgoritmoPrim() {
        boolean[] enArbol = new boolean[numEstaciones];
        Arista[] arbol = new Arista[numEstaciones - 1];
        int costoTotal = 0;

        enArbol[0] = true; // Comenzar desde la primera estación

        for (int e = 0; e < numEstaciones - 1; e++) {
            int minCosto = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < numEstaciones; i++) {
                if (enArbol[i]) {
                    for (Arista arista : estaciones[i].getConexiones()) {
                        if (arista != null && !enArbol[Arrays.asList(estaciones).indexOf(arista.destino)] 
                            && arista.costo < minCosto) {
                            minCosto = arista.costo;
                            minIndex = Arrays.asList(estaciones).indexOf(arista.destino);
                        }
                    }
                }
            }

            enArbol[minIndex] = true;
            arbol[e] = estaciones[minIndex].getConexiones()[0]; // Guardar la conexión
            costoTotal += minCosto;
        }

        // Mostrar el resultado
        System.out.println("Conexiones en el Árbol de Recubrimiento Mínimo:");
        for (Arista arista : arbol) {
            if (arista != null) {
                System.out.println(arista.destino.ciudad + " con costo: " + arista.costo);
            }
        }
        System.out.println("Costo total: " + costoTotal);
    }
}
