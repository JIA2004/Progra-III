public class Main {
    public static void main(String[] args) {

        int[] array = new int[7];
        int maxi = 0;

        array[0] = 2;
        array[1] = 12;
        array[2] = 43;
        array[3] = 23;
        array[4] = 65;
        array[5] = 9;
        array[6] = 10;

        for (int i : array) {
            if  (i > maxi) {
                maxi = i;
            }
        }

        System.out.println(maxi);

    }
}