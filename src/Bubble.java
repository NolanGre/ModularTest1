public class Bubble {
    public static void main(String[] args) {

        int[] arr = {1, 7, 5, 13, 2};

        System.out.print("Масив: ");
        printArray(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.println("i = " + i + ';');
            for (int j = 0; j < arr.length - 1 - i; j++){

                System.out.print("    j = " + j + "    ");
                if (arr[j] > arr[j + 1]) {

                    System.out.println(arr[j] + " > " + arr[j + 1] + " (True) -> swap(" + arr[j] + ", " + arr[j + 1] + ");");
                    swap(arr, j , j + 1);
                }
                else System.out.println(arr[j] + " > " + arr[j + 1] + " (False)");
            }
        }

        System.out.print("Результат: ");
        printArray(arr);
    }

    public static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.print('[');
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");
        }
        System.out.println(']');
    }
}
