package Clase6.Actividad4;



public class Main {
    public static void main(String[] args) {
            int[] costos = {12, 20, 15, 25};
            int[] beneficios = {150, 200, 100, 300};
            int presupuesto = 35;
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
