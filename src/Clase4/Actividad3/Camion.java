package Clase4.Actividad3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Camion {
    private double capacidad;

    public Camion(double capacidad) {
        this.capacidad = capacidad;
    }

    public List<Mercancia> cargar(List<Mercancia> mercancias) {
        List<Mercancia> seleccionadas = new ArrayList<>();
        double pesoActual = 0;

        // Ordenar mercancías por valor por peso en orden descendente
        mercancias.sort(Comparator.comparing(Mercancia::getValorPorPeso).reversed());

        for (Mercancia mercancia : mercancias) {
            if (pesoActual + mercancia.getPeso() <= capacidad) {
                seleccionadas.add(mercancia);
                pesoActual += mercancia.getPeso();
            } else {
                // Agregar fracción de mercancía
                double pesoRestante = capacidad - pesoActual;
                if (pesoRestante > 0) {
                    seleccionadas.add(new Mercancia(mercancia.getNombre() + " (fracción)", 
                                                     mercancia.getValor() * (pesoRestante / mercancia.getPeso()), 
                                                     pesoRestante));
                    break; // No se puede añadir más mercancía
                }
            }
        }
        return seleccionadas;
    }
}


