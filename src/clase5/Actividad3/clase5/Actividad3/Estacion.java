package clase5.Actividad3;
import java.util.Arrays;

public class Estacion {
    
    String ciudad;
    Estacion[] conexiones = new Estacion[10];
    int i = 0;

    public Estacion(String ciudad) {
        this.ciudad = ciudad;
    }

    public void agregarConexion(Estacion estacion) {
        if (i >= conexiones.length) {
            conexiones = Arrays.copyOf(conexiones, conexiones.length + 10);
        }
        conexiones[i] = estacion;
        i++;
    }
}