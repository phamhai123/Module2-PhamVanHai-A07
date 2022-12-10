package thi_module_2.validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAccount {
    private static Scanner scanner = new Scanner(System.in);
    private static final String DATE = "dd/MM/yyyy";
    public static String date(String enter) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE);
        System.out.println("Enter day " + DATE);
        String date = null;
        Date day;
        do {
            try {
                date = scanner.nextLine();
                day = dateFormat.parse(date);
                dateFormat.setLenient(false);
                day = dateFormat.parse(date);
            } catch (ParseException e) {
                System.out.println("Enter error, please re-enter ! ==" + DATE +"==");
                day = null;
            }
        }while (day == null);
        return date;
    }

}
