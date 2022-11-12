package task01.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        int choose;
        do {
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Employee Management");
                    break;
                case 2:
                    System.out.println("Customer Management");
                    break;
                case 3:
                    System.out.println("Facility Management");
                    break;
                case 4:
                    System.out.println("Booking Management");
                    break;
                case 5:
                    System.out.println("Promotion Management");
                    break;
            }
        }while (choose != 6);
    }
    public static String isEmployee() {
            return ;
    }
}
