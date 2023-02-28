package thi_module_2.validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RegexAccount {
    private static Scanner scanner = new Scanner(System.in);
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String MESSAGE_ERROR = "Enter error !";
    public static String inputDate( Scanner sc) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        System.out.println("In format " + DATE_FORMAT);
        String value = sc.nextLine();
        try {
            dateFormat.setLenient(false);
            dateFormat.parse(value);
        } catch (ParseException e) {
            System.out.println(MESSAGE_ERROR);
            return inputDate(sc);
        }
        return value;
    }
}
