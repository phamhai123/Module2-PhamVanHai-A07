package mvc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegexCustomerUtils {
    private static final String OLD_FORMAT = "dd/MM/yyyy";
    private static Scanner scanner = new Scanner(System.in);
    public static int isId(){
        System.out.println("Enter id :");
        return scanner.nextInt();
    }
    public static String isName(){
        System.out.println("Enter name of customer :");
        return scanner.next();
    }
    public static String isBirthDate(){
        System.out.println("Enter birth date of customer :");
        SimpleDateFormat date = new SimpleDateFormat(OLD_FORMAT);
        return date.format(scanner.next());

    }
    public static String isSex() {
        System.out.println("Choose sex of customer :");
        String sex = scanner.next();
        switch (sex){
            case "1":
                sex = "Male";
                break;
            case "2":
                sex = "Female";
                break;
            default:
                System.out.println("Enter error, please re-enter !");
        }
        return sex;
    }
    public static int isIdentityCard() {
        System.out.println("Enter identity card :");
        return scanner.nextInt();
    }
    public static int isPhoneNumber() {
        System.out.println("Enter phone number of customer :");
        return scanner.nextInt();
    }
    public static String isEmail() {
        System.out.println("Enter email :");
        return scanner.next();
    }
    public static String isStyleGuest() {
        System.out.println("Enter style guest :");
        return scanner.next();
    }
    public static String isAddress() {
        System.out.println("Enter address of customer :");
        return scanner.next();
    }
}
