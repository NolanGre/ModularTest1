public class binToOct {
    public static void main(String[] args) {

        // 1. Enter your bin number
        String binNum = "1011010101";   // = 1325 Octal

        System.out.println("Initial num: " + binNum);

        // Pad with leading zeros to make the length a multiple of 3
        while (binNum.length() % 3 != 0) {

            binNum = "0" + binNum;
            System.out.println("Add 0: " + binNum);
        }

        String octalNum = "";

        for (int i = 0; i < binNum.length(); i += 3){

            System.out.print("i = " + i + "; take: " + binNum.substring(i, i + 3));
            octalNum += switchOctal(binNum.substring(i, i + 3));
            System.out.println(" -> " + octalNum.charAt(octalNum.length() - 1));
        }

        System.out.println("Результат: " + octalNum);
    }

    public static String switchOctal(String group) {

        return switch (group) {
            case "000" -> "0";
            case "001" -> "1";
            case "010" -> "2";
            case "011" -> "3";
            case "100" -> "4";
            case "101" -> "5";
            case "110" -> "6";
            case "111" -> "7";
            default -> "";
        };
    }
}
