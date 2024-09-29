package Clase6.Actividad1;

public class MochilaFuerzaBruta {
    public static int maximoValor(Objeto[] objetos, int capacidad) {
        return fuerzaBruta(objetos, capacidad, 0);
    }

    private static int fuerzaBruta(Objeto[] objetos, int capacidad, int indice) {
        // Caso base: si ya revisamos todos los objetos o no hay capacidad restante
        if (indice == objetos.length || capacidad == 0) {
            return 0;
        }

        // Si el peso del objeto actual es mayor que la capacidad restante, no podemos incluirlo
        if (objetos[indice].getPeso() > capacidad) {
            return fuerzaBruta(objetos, capacidad, indice + 1);
        }

        // Opción 1: No incluir el objeto actual
        int valorSinIncluir = fuerzaBruta(objetos, capacidad, indice + 1);

        // Opción 2: Incluir el objeto actual
        int valorConIncluir = objetos[indice].getValor() + 
                              fuerzaBruta(objetos, capacidad - objetos[indice].getPeso(), indice + 1);

        // Devolvemos el máximo entre incluirlo o no incluirlo
        return Math.max(valorSinIncluir, valorConIncluir);
    }

}
