package Clase5.Actividad3;
public class Main {
    public static void main(String[] args) {
        Estacion estacionA = new Estacion("Ciudad A");
        Estacion estacionB = new Estacion("Ciudad B");
        Estacion estacionC = new Estacion("Ciudad C");
        Estacion estacionD = new Estacion("Ciudad D");

        // Crear conexiones con costos
        Conexion conexion1 = new Conexion(estacionA, estacionB, 5);
        Conexion conexion2 = new Conexion(estacionB, estacionC, 10);
        Conexion conexion3 = new Conexion(estacionC, estacionD, 3);
        Conexion conexion4 = new Conexion(estacionA, estacionD, 15);

        // Crear la red eléctrica
        RedElectrica red = new RedElectrica(10);
        red.agregarEstacion(estacionA);
        red.agregarEstacion(estacionB);
        red.agregarEstacion(estacionC);
        red.agregarEstacion(estacionD);

        // Aplicar el algoritmo de Prim
        red.aplicarAlgoritmoPrim();
    }
}
