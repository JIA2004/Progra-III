package Clase4.Actividad3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mercancia> mercancias = new ArrayList<>();
        mercancias.add(new Mercancia("Mercancía A", 60, 10));
        mercancias.add(new Mercancia("Mercancía B", 100, 20));
        mercancias.add(new Mercancia("Mercancía C", 120, 30));

        double capacidadCamion = 50;
        Camion camion = new Camion(capacidadCamion);

        List<Mercancia> resultado = camion.cargar(mercancias);
        
        System.out.println("Mercancías seleccionadas:");
        for (Mercancia m : resultado) {
            System.out.println(m.getNombre() + " - Valor: " + m.getValor() + ", Peso: " + m.getPeso());
        }
    }
}
