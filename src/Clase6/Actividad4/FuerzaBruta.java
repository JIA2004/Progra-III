package Clase6.Actividad4;

public class FuerzaBruta {
    
    public int maxBeneficioFuerzaBruta(int[] costos, int[] beneficios, int presupuesto, int n) {
        if (n == 0 || presupuesto == 0) {
            return 0;
        }
        if (costos[n - 1] > presupuesto) {
            return maxBeneficioFuerzaBruta(costos, beneficios, presupuesto, n - 1);
        } else {
            int incluir = beneficios[n - 1] + maxBeneficioFuerzaBruta(costos, beneficios, presupuesto - costos[n - 1], n - 1);
            int excluir = maxBeneficioFuerzaBruta(costos, beneficios, presupuesto, n - 1);
            return Math.max(incluir, excluir);
        }
    }

}
