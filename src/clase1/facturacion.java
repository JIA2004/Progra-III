package Clase1;

import java.util.ArrayList;
import java.util.List;

public class facturacion {
    public static void main(String[] args) {
        int[][] documentos={{54,36,3400},{55,12,4300},{56,25,2500}};
        Cliente cliente1=new Cliente(36, "Lucas");
        Cliente cliente2=new Cliente(12, "Franco");
        Cliente cliente3=new Cliente(25, "María");

        List<Cliente> listaClientes = new ArrayList<>(); //creamos listas
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        List<Resumen> resumenes = calcularSuma(documentos, listaClientes);
        for(Resumen resumen : resumenes){
            System.out.println(resumen);
        }
    }
    
    public static List<Resumen> calcularSuma(int [][] documentos, List<Cliente> listaClientes){
        List<Resumen> resumenes = new ArrayList<>();

        for(Cliente cliente : listaClientes){
            double totalImportes = 0.0;
            for(int[] documento : documentos){
                int codigoCliente = documento[1];
                double importe = documento[2];
                if (codigoCliente == cliente.getId()) {
                    totalImportes += importe;
                }
            }
            resumenes.add(new Resumen(cliente.getId(), cliente.getNombre(), totalImportes));
        }
        return resumenes;
    }
}

class Resumen {
    private int codigoCliente;
    private String nombreCliente;
    private double totalImportes;

    public Resumen(int codigoCliente, String nombreCliente, double totalImportes) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.totalImportes = totalImportes;
    }

    @Override
    public String toString() {
        return "clase1.Resumen= codigoCliente= " + codigoCliente + ", nombreCliente= " + nombreCliente + ", totalImportes= " + totalImportes;
    }
}
