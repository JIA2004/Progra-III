package Clase6.Actividad3;

public class Main {

        public static void main(String[] args) {
            int[] costos = {10, 15, 20, 25};
            int[] beneficios = {100, 200, 150, 300};
            int presupuesto = 40;
            int n = costos.length;
    
            // Crear instancias de cada clase
            FuerzaBruta fb = new FuerzaBruta();
            Greedy greedy = new Greedy();
            ProgramacionDinamica dp = new ProgramacionDinamica();
    
            // Llamar a Fuerza Bruta
            System.out.println("Beneficio máximo (Fuerza Bruta): " + fb.maxBeneficioFuerzaBruta(costos, beneficios, presupuesto, n));
    
            // Llamar a Greedy
            System.out.println("Beneficio máximo (Greedy): " + greedy.maxBeneficioGreedy(costos, beneficios, presupuesto));
    
            // Llamar a Programación Dinámica
            System.out.println("Beneficio máximo (Programación Dinámica): " + dp.maxBeneficioDP(costos, beneficios, presupuesto));
        }
    
}
