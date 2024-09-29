package clase5.Actividad3;
import java.util.Arrays;

class Estacion {
    String ciudad;
    Arista[] conexiones = new Arista[10];
    int i = 0;

    public Estacion(String ciudad) {
        this.ciudad = ciudad;
    }

    public void agregarConexion(Estacion estacion, int costo) {
        if (i >= conexiones.length) {
            conexiones = Arrays.copyOf(conexiones, conexiones.length + 10);
        }
        conexiones[i] = new Arista(estacion, costo);
        i++;
    }

    public Arista[] getConexiones() {
        return conexiones;
    }
}
