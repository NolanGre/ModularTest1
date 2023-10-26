public class Diff {
    public static void main(String[] args) {

        // 1. Enter your array
        int[] arr = {11, 4, 6, 15, 3};

        // 2. Select the one you need

        //System.out.println("Результат: " + maxDiff(arr));
        //System.out.println("Результат: " + minDiff(arr));
    }

    static int maxDiff (int[] arr){

        int max = arr[0];
        int min = arr[0];
        System.out.println("max = "+ arr[0] + "; min = " + arr[0]);

        for (int i = 0; i < arr.length - 1; i++){
            System.out.println("i = " + i + ';');

            if (arr[i] < min) {
                System.out.println("    arr[i] < " + min + " (True) -> min = " + arr[i] + ';');
                min = arr[i];
            }
            else System.out.println("    arr[i] < " + min + " (False)");

            if (arr[i] > max) {
                System.out.println("    arr[i] > " + max + " (True) -> max = " + arr[i] + ';');
                max = arr[i];
            }
            else System.out.println("    arr[i] > " + max + " (False)");
        }
        System.out.println(max + "(max) - " + min + "(min)");
        return max - min;
    }

    static int minDiff (int[] arr){

        int min_diff = Math.abs(arr[0] - arr[1]);
        System.out.println("min_diff = abs(" + arr[0] + "[0] - " + arr[1] + "[1]);");

        for (int i = 0; i < arr.length; i++){

            System.out.println("i = " + i + ';');
            for (int j = i + 1; j < arr.length; j++){

                System.out.print("    j = " + j);
                System.out.print("; abs(" + arr[i] + '[' + i + "] - " + arr[j] + '[' + j + "]) < " + min_diff);
                if (Math.abs(arr[i] - arr[j]) < min_diff) {

                    System.out.println(" (True) -> " + "min_diff = abs(" + arr[i] + " - " + arr[j] + ");");
                    min_diff = Math.abs(arr[i] - arr[j]);
                }
                else System.out.println(" (False)");
            }
        }
        //System.out.println("End");
        return min_diff;
    }
}
