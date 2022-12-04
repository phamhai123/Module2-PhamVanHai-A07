package mvc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPersonUtils {
    private static final String OLD_FORMAT = "dd/MM/yyyy";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PHONE_NUMBER = "^(\\d{3}[- ]?){2}\\d{4}$";
    private static Scanner scanner = new Scanner(System.in);
    public static int isId(){
        System.out.println("Enter id :");
        return scanner.nextInt();
    }
    public static String isName(){
        System.out.println("Enter name :");
        return scanner.next();
    }
    public static String isBirthDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(OLD_FORMAT);
        System.out.println("Enter birth date " + OLD_FORMAT);
        String date = null;
        Date day = null;
        do {
            try {
                date = scanner.next();
                day = dateFormat.parse(date);
            } catch (ParseException e) {
                System.out.println("Enter error, please re-enter ! ==" + OLD_FORMAT +"==");
            }
        }while (day == null);
        return date;
    }
    public static String isSex() {
        String sex = null;
        do {
            System.out.println("Choose sex:\n" +
                    "1. Male \n" +
                    "2. Female \n");
            switch (sex = scanner.next()){
                case "1":
                    sex = "Male";
                    break;
                case "2":
                    sex = "Female";
                    break;
                default:
                    System.out.println("Enter error, please re-enter !");
                    sex = null;
            }
        }while (sex == null);
        return sex;
    }
    public static double isIdentityCard() {
        System.out.println("Enter identity card :");
        return scanner.nextDouble();
    }
    public static double isPhoneNumber() {
        System.out.println("Enter phone number :");
        return scanner.nextDouble();
    }
    public static String isEmail() {
        boolean isvalid;
        String email;
        do {
            System.out.println("Enter email :");
            email = scanner.next();
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            isvalid = matcher.matches();
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }while (isvalid == false);

        return email;
    }
    public static String isTypeGuest() {
        String choose;
        do {
            System.out.println("1. Diamond \n"+
                    "2. Platinum \n" +
                    "3. Gold \n" +
                    "4. Silver \n" +
                    "5. Member \n" +
                    "Enter style guest :");
            switch (choose = scanner.next()) {
                case "1":
                    choose = "Diamond";
                    break;
                case "2":
                    choose = "Platinum";
                    break;
                case "3":
                    choose = "Gold";
                    break;
                case "4":
                    choose = "Silver";
                    break;
                case "5":
                    choose = "Member";
                    break;
                default:
                    System.out.println("Enter error, please re-enter!");
                    choose = null;
            }
        }while (choose == null);
        return choose;
    }
    public static String isAddress() {
        System.out.println("Enter address of customer :");
        return scanner.next();
    }
    public static String isLevelEmp() {
        String level;
        do {
            System.out.println("1. High School \n"+
                    "2. College \n" +
                    "3. University \n" +
                    "4. After University \n"+
                    "Enter choose education Level :");
            switch (level = scanner.next()) {
                case "1":
                    level = "High School";
                    break;
                case "2":
                    level = "College";
                    break;
                case "3":
                    level = "University";
                    break;
                case "4":
                    level = "After University";
                    break;
                default:
                    level = null;
                    System.out.println("Enter error, please re-ent !");
            }
        }while (level == null);

        return level;
    }
    public static String isPosition() {
        String choose;
        do {
            System.out.println("1. Receptionist \n"+
                    "2. Waiter \n" +
                    "3. Specialist \n" +
                    "4. Supervisor \n" +
                    "5. Manager \n" +
                    "6. Director \n" );
            switch (choose = scanner.next()) {
                case "1":
                    choose = "Receptionist";
                    break;
                case "2":
                    choose = "Waiter";
                    break;
                case "3":
                    choose = "Specialist";
                    break;
                case "4":
                    choose = "Supervisor";
                    break;
                case "5":
                    choose = "Manager";
                    break;
                case "6":
                    choose = "Director";
                    break;
                default:
                    choose = null;
                    System.out.println("Enter error, please re-ent !");
            }
        }while (choose == null);

        return choose;
    }
    public static double isSalary() {
        System.out.println("Enter salary of employee :");
        return scanner.nextDouble();
    }

}
