package mvc.utils;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static String inputString(String message, Scanner scanner, String regex) {
        System.out.println(message);
        String value = scanner.nextLine();
        if (value.matches(regex)) {
            return value;
        } else {
            System.out.println("Error!");
        }
        return inputString(message, scanner, regex);
    }
    public static double inputDouble(String message, Scanner scanner) {
        double result = 0;
        System.out.println(message);
        String inputValue = scanner.nextLine();
        try {
            result = Double.parseDouble(inputValue);
        } catch (Exception e) {
            System.out.println("Error!");
            return inputDouble(message, scanner);
        }
        return result;
    }

}
