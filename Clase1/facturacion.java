import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class facturacion {
    public static void main(String[] args) {

        int[][] comprobantes = {
            {53, 23, 5500},
            {54, 12, 4300},
            {55, 54, 8200},
            {56, 52, 10000},
            {57, 36, 3200}
        };
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(12, "Lucas"));
        clientes.add(new Cliente(52, "Franco"));
        clientes.add(new Cliente(36, "María"));


        List<Resultado> resultados = calcularSumaImportes(comprobantes, clientes);


        for (Resultado resultado : resultados) {
            System.out.println(resultado);
        }
    }

    public static List<Resultado> calcularSumaImportes(int[][] comprobantes, List<Cliente> clientes) {

        Map<Integer, Double> sumaImportesMap = new HashMap<>();


        for (int[] comprobante : comprobantes) {
            int idCliente = comprobante[1];
            double importe = comprobante[2];


            sumaImportesMap.put(idCliente, sumaImportesMap.getOrDefault(idCliente, 0.0) + importe);
        }
        List<Resultado> resultados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            double sumaImportes = sumaImportesMap.getOrDefault(cliente.getId(), 0.0);
            resultados.add(new Resultado(cliente.getId(), cliente.getNombre(), sumaImportes));
        }

        return resultados;
    }
}


class Cliente {
    private int id;
    private String nombre;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}


class Resultado {
    private int idCliente;
    private String nombreCliente;
    private double sumaImportes;

    public Resultado(int idCliente, String nombreCliente, double sumaImportes) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.sumaImportes = sumaImportes;
    }

    @Override
    public String toString() {
        return "Resultado: idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", sumaImportes=" + sumaImportes;
    }
}