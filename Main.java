public class Main {
    public static void main(String[] args) {

        int[] array = {1,43,12,44,60,65}; //1
        int maxi = 0; //1

        for (int i : array) { //1 + 2(n+1) + n
            if  (i > maxi) { //n
                maxi = i; //n
            }
        }

        System.out.println(maxi); //1.

    }
}