public class Merge {
    public static void main(String[] args) {

        int[] L = {1,4,5,9};
        int[] R = {3,6,10};

        int[] arr = new int[L.length + R.length];

        System.out.print("L: ");
        printArray(L);
        System.out.print("R: ");
        printArray(R);

        System.out.println("Створюємо масив довжина якого: " + L.length + " + " + R.length + ";");
        System.out.println("(Довжина першого + другого масиву)");

        int i = 0;
        int j = 0;

        int k = 0;
        System.out.println("i = " + i + "; j = " + j + "; k = " + k + ';');

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                System.out.println("L[i] <= R[j] (True)");
                arr[k] = L[i];
                System.out.println("    arr[k] = L[i] = " + arr[k] + ';');
                i++;
                System.out.print("    i++ = " + i);
            }
            else {
                System.out.println("L[i] <= R[j] (False)");
                arr[k] = R[j];
                System.out.println("    arr[k] = R[j] = " + arr[k] + ';');
                j++;
                System.out.print("    j++ = " + j);
            }
            k++;
            System.out.println("; k++ = " + k + ';');
        }

        System.out.println("i < sizeL && j < sizeR (False)");

        while (i < L.length) {
            System.out.println("i < sizeL (True)");
            arr[k] = L[i];
            System.out.println("    arr[k] = L[i] = " + arr[k] + ';');
            i++;
            k++;
            System.out.println("    i++ = " + i + "; k++ = " + k + ';');
        }

        while (j < R.length) {
            System.out.println("j < sizeR (True)");
            arr[k] = R[j];
            System.out.println("    arr[k] = R[j] = " + arr[k] + ';');
            j++;
            k++;
            System.out.println("    j++ = " + j + "; k++ = " + k + ';');
        }

        System.out.print("arr: ");
        printArray(arr);
        System.out.println(" ");
    }

    public static void printArray(int[] arr) {
        System.out.print('[');
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]);
            if(j + 1 < arr.length) System.out.print(", ");     // можно менять запятую на ; или просто пробел
        }
        System.out.println(']');
    }

}