package mvc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputUntil {
    private static String MESSAGE = "Input invalid!";
    private static String DATE_FORMAT = "dd/MM/yyyy";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(inputInteger("choose", scanner));
    }

    // Input integer
    public static int inputInteger(String message, Scanner sc) {
        int result = 0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        try {
            result = Integer.parseInt(inputValue);
        } catch (Exception e) {
            System.out.println(MESSAGE);
            return inputInteger(message, sc);
        }
        return result;
    }

    public static int inputInteger(String message, Scanner sc, String regex) {
        int result = 0;
        System.out.println(message);
        String value = sc.nextLine();
        if (value.matches(regex)) {
            try {
                result = Integer.parseInt(value);
            } catch (Exception e) {
                System.out.println(MESSAGE);
                return inputInteger(message, sc, regex);
            }
        } else {
            System.out.println(MESSAGE);
            return inputInteger(message, sc, regex);
        }
        return result;
    }

    public static double inputDouble(String message, Scanner sc) {
        double result = 0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        try {
            result = Double.parseDouble(inputValue);
        } catch (Exception e) {
            System.out.println(MESSAGE);
            return inputDouble(message, sc);
        }
        return result;
    }

    public static double inputDouble(String message, Scanner sc, String regex) {
        double result = 0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        if (inputValue.matches(regex)) {
            try {
                result = Double.parseDouble(inputValue);
            } catch (Exception e) {
                System.out.println(MESSAGE);
                return inputDouble(message, sc, regex);
            }
        } else {
            System.out.println(MESSAGE);
            return inputDouble(message, sc, regex);
        }
        return result;
    }

    public static float inputFloat(String message, Scanner sc) {
        float result = 0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        try {
            result = Float.parseFloat(inputValue);
        } catch (Exception e) {
            System.out.println(MESSAGE);
            return inputFloat(message, sc);
        }
        return result;
    }

    public static float inputFloat(String message, Scanner sc, String regex) {
        float result = 0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        if (inputValue.matches(regex)) {
            try {
                result = Float.parseFloat(inputValue);
            } catch (Exception e) {
                System.out.println(MESSAGE);
                return inputFloat(message, sc, regex);
            }
        } else {
            System.out.println(MESSAGE);
            return inputFloat(message, sc, regex);
        }
        return result;
    }

    public static String inputString(String message, Scanner sc) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static String inputString(String message, Scanner sc, String regex) {
        System.out.println(message);
        String value = sc.nextLine();
        if (value.matches(regex)) {
            return value;
        } else {
            System.out.println(MESSAGE);
        }
        return inputString(message, sc, regex);
    }

    public static String inputDate(String message, Scanner sc) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        System.out.println("In format " + DATE_FORMAT);
        System.out.println(message);
        String value = sc.nextLine();
        try {
            dateFormat.setLenient(false);
            dateFormat.parse(value);
        } catch (ParseException e) {
            System.out.println("Enter error, please re-enter!");
            return inputDate(message, sc);
        }
        return value;
    }

    public static String inputList(String message, Scanner sc, String list) {
        Map<Integer, String> map = new HashMap<>();
        String[] array = list.split(",");
        int count = 1;
        String result = "";
        for (String in : array) {
            map.put(count, in);
            count++;
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + ". " + map.get(key));
        }
        System.out.println(message);
        String choose = sc.nextLine();
        try {
            if ((result = map.get(Integer.parseInt(choose))) == null) {
                System.out.println(MESSAGE);
                return inputList(message, sc, list);
            }
        } catch (Exception e) {
            System.out.println(MESSAGE);
            return inputList(message, sc, list);
        }
        return result;
    }

}
