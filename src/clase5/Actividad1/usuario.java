package clase5.Actividad1;

import java.util.Arrays;

public class usuario {
    int usuario;
    int[] valores;
    int valoresSize;
    usuario siguiente;

    usuario(int usuario, int valorInicial) {
        this.usuario = usuario;
        this.valores = new int[1];
        this.valores[0] = valorInicial;
        this.valoresSize = 1;
        this.siguiente = null;
    }

    void seguirValor(int valor) {
        if (this.valoresSize == this.valores.length) {
            this.valores = Arrays.copyOf(this.valores, this.valoresSize * 2);
        }

        this.valores[this.valoresSize++] = valor;
    }

    int[] obtenerValores() {
        return Arrays.copyOf(this.valores, this.valoresSize);
    }
}