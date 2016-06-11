import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int maxValue = 0;
        int minValue = array[0];
        int median = 0;
        int sum = 0;
        int valueCenter1 = 0;
        int valueCenter2 = 0;

        for (int element : array) {

            if (element > maxValue) {
                maxValue = element;
            }

            if (element < minValue) {
                minValue = element;
            }

            sum = sum + element;
        }

        // median search
        Arrays.sort(array);

        if (array.length % 2 == 0) {
            valueCenter1 = array[array.length / 2];
            valueCenter2 = array[(array.length / 2) - 1];
        } else {
            valueCenter1 = array[array.length / 2];
        }

        System.out.println("max value is: " + maxValue);
        System.out.println("min value is: " + minValue);
        System.out.println("average is: " + (double) sum / (double) array.length);
        System.out.println("median is: " + (valueCenter1 + valueCenter2) / 2);

    }
}
