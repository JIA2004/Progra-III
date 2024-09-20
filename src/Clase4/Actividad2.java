package Clase4;
public class Actividad2 {
    public static void main(String[] args) {
        int M= 1;
        int C= 100;
        int B= 1000;

        int cantM=0;
        int cantC=0;
        int cantB=0;
        int comprademoneda = 7583;
    

        while (comprademoneda != 0){
            while (comprademoneda>=B){
                comprademoneda = comprademoneda-B;
                cantB++;
            }
            while (comprademoneda>=C){
                comprademoneda = comprademoneda-C;
                cantC++;
            }
            while (comprademoneda>=M){
                comprademoneda = comprademoneda-M;
                cantM++;
            }
        }
        System.out.println("Cantidad de Bonos: " + cantB);
        System.out.println("Cantidad de Cheques: " + cantC);
        System.out.println("Cantidad de Monedas: " + cantM);
    }
}

    