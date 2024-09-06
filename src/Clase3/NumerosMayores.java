package Clase3;

public class NumerosMayores {

    public static int[] buscarMayores(int[] listaNumeros, int inicio, int fin) {
        int[] listaMayores = new int[2];

        if (inicio == fin) {
            listaMayores[0] = listaNumeros[inicio];
            listaMayores[1] = Integer.MIN_VALUE;
            return listaMayores;
        }

        int medio = (inicio + fin) / 2;
        
        int[] numeroMaxIzq = buscarMayores(listaNumeros, inicio, medio);
        int[] numeroMaxDer = buscarMayores(listaNumeros, medio + 1, fin);

        if (numeroMaxIzq[0] > numeroMaxDer[0]) {
            listaMayores[0] = numeroMaxIzq[0];
            listaMayores[1] = Math.max(numeroMaxIzq[1], numeroMaxDer[0]);
        } else {
            listaMayores[0] = numeroMaxDer[0];
            listaMayores[1] = Math.max(numeroMaxIzq[0], numeroMaxDer[1]);
        }

        return listaMayores;
    }

    public static void main(String[] args) {
        int[] listaNum = {23, 43, 25, 56, 34, 67};

        int[] mayores = buscarMayores(listaNum, 0, listaNum.length - 1);

        imprimirArray(mayores);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = i+1;
            System.out.println("El "+num+"° número mayor de la lista es: " + array[i]);
        }
    }
}
