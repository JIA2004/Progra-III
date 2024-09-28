package clase5.Actividad3;

public class Conexion {
    Estacion estacion1;
    Estacion estacion2;

    public Conexion(Estacion estacion1, Estacion estacion2) {
        estacion1.agregarConexion(estacion2);
        estacion2.agregarConexion(estacion1);
    }
}