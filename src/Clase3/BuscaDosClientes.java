package Clase3;

public class BuscaDosClientes {
    public static Cliente[] buscarDosClientes(Cliente[] listaClientes, int inicio, int fin) {
        Cliente[] clientesMaximos = new Cliente[2];

        if (inicio == fin) { 
            clientesMaximos[0] = listaClientes[inicio];
            clientesMaximos[1] = new Cliente(1, " ", 1);
            return clientesMaximos;
        }

        int medio = (inicio + fin) / 2;

        Cliente[] maxIzq = buscarDosClientes(listaClientes, inicio, medio);
        Cliente[] maxDer = buscarDosClientes(listaClientes, medio + 1, fin);

        if (maxIzq[0].scoring > maxDer[0].scoring) {
            clientesMaximos[0] = maxIzq[0];
            if (maxIzq[1].scoring > maxDer[0].scoring) {
                clientesMaximos[1] = maxIzq[1];
            } else {
                clientesMaximos[1] = maxDer[0];
            }
        } else {
            clientesMaximos[0] = maxDer[0];
            if (maxIzq[0].scoring > maxDer[1].scoring) {
                clientesMaximos[1] = maxIzq[0];
            } else {
                clientesMaximos[1] = maxDer[1];
            }
        }

        return clientesMaximos;
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
            new Cliente(1, "Ana", 80),
            new Cliente(2, "Luis", 90),
            new Cliente(3, "Carlos", 70),
            new Cliente(4, "María", 85),
            new Cliente(5, "José", 60)
        };

        Cliente[] clientesMaximos = buscarDosClientes(clientes, 0, clientes.length - 1);
        System.out.println("Cliente con mayor scoring: " + clientesMaximos[0].nombre + " con scoring " + clientesMaximos[0].scoring);
        System.out.println("Segundo cliente con mayor scoring: " + clientesMaximos[1].nombre + " con scoring " + clientesMaximos[1].scoring);
    }
}

class Cliente {
    int id;
    String nombre;
    int scoring;

    public Cliente(int id, String nombre, int scoring) {
        this.id = id;
        this.nombre = nombre;
        this.scoring = scoring;
    }
}