package Clase3;

public class NNumerosMayores {

    public static int[] buscarMayores(int[] listaNumeros, int inicio, int fin, int n) {
        int[] listaMayores = new int[n];

        if (inicio == fin) {
            listaMayores[0] = listaNumeros[inicio];
            return listaMayores;
        }

        int medio = (inicio + fin) / 2;

        int[] mayoresIzq = buscarMayores(listaNumeros, inicio, medio, n);
        int[] mayoresDer = buscarMayores(listaNumeros, medio + 1, fin, n);

        listaMayores = mayor(mayoresIzq, mayoresDer, n);

        return listaMayores;
    }

    private static int[] mayor(int[] izq, int[] der, int n) {
        int[] resultado = new int[n];
        int i = 0, j = 0, k = 0;

        while (i < izq.length && j < der.length && k < n) {
            if (izq[i] > der[j]) {
                resultado[k++] = izq[i++];
            } else {
                resultado[k++] = der[j++];
            }
        }

        while (i < izq.length && k < n) {
            resultado[k++] = izq[i++];
        }

        while (j < der.length && k < n) {
            resultado[k++] = der[j++];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] listaNum = {23, 43, 25, 56, 34, 67, 78, 89, 92};
        int n = 5; // Cantidad de mayores que queremos encontrar

        int[] mayores = buscarMayores(listaNum, 0, listaNum.length - 1, n);

        imprimirArray(mayores);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("El " + (i+1) + "° número mayor de la lista es: " + array[i]);
        }
    }
}
