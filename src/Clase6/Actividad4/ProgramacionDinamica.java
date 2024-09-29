package Clase6.Actividad4;

public class ProgramacionDinamica {
    public int maxBeneficioDP(int[] costos, int[] beneficios, int presupuesto) {
        int n = costos.length;
        int[][] dp = new int[n + 1][presupuesto + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= presupuesto; w++) {
                if (costos[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], beneficios[i - 1] + dp[i - 1][w - costos[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][presupuesto];
    }
}
