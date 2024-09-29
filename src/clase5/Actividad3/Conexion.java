package clase5.Actividad3;
class Conexion {
    Estacion estacion1;
    Estacion estacion2;
    int costo;

    public Conexion(Estacion estacion1, Estacion estacion2, int costo) {
        this.costo = costo;
        estacion1.agregarConexion(estacion2, costo);
        estacion2.agregarConexion(estacion1, costo);
    }
}
