package clase1;

public class maximo {
    public static void main(String[] args) {

        int[] array = {1,43,12,44,60,65}; //1
        int maxi = 0; //1

        for (int i : array) { //1 + n
            if  (i > maxi) { //n
                maxi = i; //n
            }
        }

        System.out.println("El máximo valor del array es el: "+maxi); //1

    }
}