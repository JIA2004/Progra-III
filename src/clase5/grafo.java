package clase5;

public class grafo {
    private usuario[] usuarios;  // Arreglo para almacenar usuarios en la red
    private int numUsuarios;     // Cantidad actual de usuarios

    public grafo(int capacidad) {
        usuarios = new usuario[capacidad]; // Tamaño inicial del grafo (número máximo de usuarios)
        numUsuarios = 0;
    }

    // Agregar un nuevo usuario a la red social
    public void agregarUsuario(String nombre) {
        if (numUsuarios < usuarios.length) {
            usuarios[numUsuarios++] = new usuario(nombre);
        } else {
            System.out.println("Capacidad máxima de usuarios alcanzada.");
        }
    }

    // Buscar un usuario por nombre
    public usuario buscarUsuario(String nombre) {
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].getNombre().equals(nombre)) {
                return usuarios[i];
            }
        }
        return null;
    }
}
