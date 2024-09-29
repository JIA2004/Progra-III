package clase5.Actividad1;

public class grafo implements interfaz {

    private usuario cabeza;

    public grafo() {
        this.cabeza = null;
    }

    @Override
    public void seguir(int usuario, int valor) {
        usuario actual = cabeza;
        while (actual != null) {
            if (actual.usuario == usuario) {
                actual.seguirValor(valor);
                return;
            }
            actual = actual.siguiente;
        }
        usuario nuevoNodo = new usuario(usuario, valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    @Override
    public void dejarDeSeguir(int usuario) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.usuario == usuario) {
            cabeza = cabeza.siguiente;
            return;
        }

        usuario actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.usuario == usuario) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    @Override
    public int[] getusuarios() {
        int tamaño = obtenerTamaño();
        int[] usuarios = new int[tamaño];
        usuario actual = cabeza;
        int index = 0;
        while (actual != null) {
            usuarios[index++] = actual.usuario;
            actual = actual.siguiente;
        }
        return usuarios;
    }

    @Override
    public int[] getValor(int usuario) {
        usuario actual = cabeza;
        while (actual != null) {
            if (actual.usuario == usuario) {
                return actual.obtenerValores();
            }
            actual = actual.siguiente;
        }
        return new int[0]; // Devolver un arreglo vacío si la usuario no existe
    }

    @Override
    public boolean isEmpty() {
        return cabeza == null;
    }

    private int obtenerTamaño() {
        int tamaño = 0;
        usuario actual = cabeza;
        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }
        return tamaño;
    }

}