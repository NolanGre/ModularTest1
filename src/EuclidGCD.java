public class EuclidGCD {
    public static void main(String[] args) {

        System.out.println("Result: " + gcd(70, 24));
    }

    public static int gcd(int m, int n){

        int r;
        while (n != 0) {

            System.out.println("r = " + (r = m % n) + ";\n  m = n = " + n + "; n = r = " + r + ';');
            m = n;
            n = r;
        }
        return m;
    }
}
