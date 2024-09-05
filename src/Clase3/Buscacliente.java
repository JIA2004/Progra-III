package Clase3;

public class Buscacliente {
    public static Cliente buscarCliente(Cliente[] listaClientes, int inicio, int fin) {
        if (inicio == fin) {
            return listaClientes[inicio];
        }

        int medio = (inicio + fin) / 2;

        Cliente clienteMaxIzquierda = buscarCliente(listaClientes, inicio, medio);
        Cliente clienteMaxDerecha = buscarCliente(listaClientes, medio + 1, fin);

        if (clienteMaxIzquierda.scoring > clienteMaxDerecha.scoring) {
            return clienteMaxIzquierda;
        } else {
            return clienteMaxDerecha;
        }
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
            new Cliente(1, "Ana", 80),
            new Cliente(2, "Luis", 90),
            new Cliente(3, "Carlos", 70),
            new Cliente(4, "María", 85),
            new Cliente(5, "José", 60)
        };

        Cliente clienteMax = buscarCliente(clientes, 0, clientes.length - 1);
        System.out.println("Cliente con el mayor scoring: " + clienteMax.nombre + " con scoring " + clienteMax.scoring);
    }
}




