public class Main {
    public static void main(String[] args) {

        int[] array = {1,43,12,44,60,65};
        int maxi = 0;

        for (int i : array) {
            if  (i > maxi) {
                maxi = i;
            }
        }

        System.out.println(maxi);

    }
}