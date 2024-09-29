package Clase6.Actividad3;


    import java.util.Arrays;

class Proyecto implements Comparable<Proyecto> {
    int costo, beneficio;
    double ratio;

    Proyecto(int costo, int beneficio) {
        this.costo = costo;
        this.beneficio = beneficio;
        this.ratio = (double) beneficio / costo;
    }

    @Override
    public int compareTo(Proyecto o) {
        return Double.compare(o.ratio, this.ratio);  // Ordenar de mayor a menor ratio
    }
}

public class Greedy {

    public int maxBeneficioGreedy(int[] costos, int[] beneficios, int presupuesto) {
        int n = costos.length;
        Proyecto[] proyectos = new Proyecto[n];
        for (int i = 0; i < n; i++) {
            proyectos[i] = new Proyecto(costos[i], beneficios[i]);
        }
        Arrays.sort(proyectos);  // Ordenar por beneficio/costo

        int beneficioTotal = 0;
        for (Proyecto proyecto : proyectos) {
            if (presupuesto >= proyecto.costo) {
                presupuesto -= proyecto.costo;
                beneficioTotal += proyecto.beneficio;
            }
        }
        return beneficioTotal;
    }
}

