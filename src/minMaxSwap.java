import java.lang.reflect.Array;
import java.util.Arrays;

public class minMaxSwap {
    public static void main(String[] args) {

        int[] arr = {10, 7, 5, 13, 2};

        System.out.println("Масив: " + Arrays.toString(arr));

        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {

            System.out.println("i = " + i + ';');
            if (arr[i] > arr[max]) {

                System.out.println("    " + arr[i] + " > " + arr[max] + "(True) -> max = " + i + ';');
                max = i;
            }
            else System.out.println("    " + arr[i] + " > " + arr[max] + "(False)");

            if (arr[i] < arr[min]) {

                System.out.println("    " + arr[i] + " > " + arr[min] + "(True) -> min = " + i + ';');
                min = i;
            }
            else System.out.println("    " + arr[i] + " < " + arr[min] + "(False)");
        }

        System.out.println("swap(" + arr[min] + ", " + arr[max] + ')');
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = arr[min];

        System.out.println("Результат: " + Arrays.toString(arr));

    }
}
