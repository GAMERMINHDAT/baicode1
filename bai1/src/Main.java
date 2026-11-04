public class Main {

    public static String chuanHoaTen(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String firstChar = word.substring(0, 1).toUpperCase();
            String restChars = word.length() > 1 ? word.substring(1).toLowerCase() : "";

            result.append(firstChar).append(restChars).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String input1 = " Nguyen Van A ";
        System.out.println("Input:  '" + input1 + "'");
        System.out.println("Output: '" + chuanHoaTen(input1) + "'");

        System.out.println("-----------------------");

        String input2 = "   Le Thi Thuy   ";
        System.out.println("Input:  '" + input2 + "'");
        System.out.println("Output: '" + chuanHoaTen(input2) + "'");

        String input3 = "a b c";
        System.out.println("Input:  '" + input3 + "'");
        System.out.println("Output: '" + chuanHoaTen(input3) + "'");
    }
}