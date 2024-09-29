package Clase6.Actividad1;

public class MochilaPrograDinamica {
    public static int maximoValor(Objeto[] objetos, int capacidad) {
        int n = objetos.length;
        int[][] dp = new int[n + 1][capacidad + 1];

        // Llenar la tabla dp de abajo hacia arriba
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidad; w++) {
                // Si el peso del objeto actual es mayor a la capacidad, no lo incluimos
                if (objetos[i - 1].getPeso() > w) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    // Tomamos el máximo entre incluir el objeto o no incluirlo
                    dp[i][w] = Math.max(dp[i - 1][w], 
                                        dp[i - 1][w - objetos[i - 1].getPeso()] + objetos[i - 1].getValor());
                }
            }
        }

        return dp[n][capacidad]; // El valor máximo se encuentra en dp[n][capacidad]
    }

}
