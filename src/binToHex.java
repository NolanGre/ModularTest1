public class binToHex {
        public static void main(String[] args) {

            // 1. Enter your bin number
            String binNum = "1011010101";   // = 1325 Octal

            System.out.println("Initial num: " + binNum);

            // Pad with leading zeros to make the length a multiple of 3
            while (binNum.length() % 4 != 0) {

                binNum = "0" + binNum;
                System.out.println("Add 0: " + binNum);
            }

            String octalNum = "";

            for (int i = 0; i < binNum.length(); i += 4){

                System.out.print("i = " + i + "; take: " + binNum.substring(i, i + 4));
                octalNum += switchOctal(binNum.substring(i, i + 4));
                System.out.println(" -> " + octalNum.charAt(octalNum.length() - 1));
            }

            System.out.println("Результат: " + octalNum);
        }

        public static String switchOctal(String group) {

            return switch (group) {
                case "0000" -> "0";
                case "0001" -> "1";
                case "0010" -> "2";
                case "0011" -> "3";
                case "0100" -> "4";
                case "0101" -> "5";
                case "0110" -> "6";
                case "0111" -> "7";
                case "1000" -> "8";
                case "1001" -> "9";
                case "1010" -> "A";
                case "1011" -> "B";
                case "1100" -> "C";
                case "1101" -> "D";
                case "1110" -> "E";
                case "1111" -> "F";
                default -> "";
            };
        }
}

