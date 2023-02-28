package mvc.service.Impl;

import mvc.model.booking.Booking;
import mvc.service.childservice.PromotionService;
import mvc.utils.FileRead;
import mvc.utils.InputUntil;
import mvc.validate.RegexLibrary;

import java.util.*;

public class PromotionServiceImpl implements PromotionService, RegexLibrary {
    private static TreeSet<Booking> bookingList = FileRead.readFromFileBooking(FILE_BOOKING);
    private static List<Integer> voucher = new ArrayList<>();
    private static Set<Booking> bookingSet = new HashSet<>();
    private static int voucherA = 0;
    private static int voucherB = 0;
    private static int voucherC = 0;
    private static int sumVoucher = 0;
    static {
        voucher.add(voucherA);
        voucher.add(voucherB);
        voucher.add(voucherC);
        for (Integer inVoucher: voucher) {
            sumVoucher += inVoucher;
        }
    }
    @Override
    public void createVoucher() {
        do {
            System.out.printf("The total %s voucher can be created ",bookingSet.size());
            System.out.println("1. Enter the number of 10% advertising vouchers\n"+
                    "2. Enter the number of 20% advertising vouchers \n"+
                    "3. Enter the number of 50% advertising vouchers \n"+
                    "4. Gift voucher");
            System.out.println("Choose:");
            switch (scanner.nextLine()){
                case "1":
                    System.out.println("Total number of vouchers: "+sumVoucher);
                    int voucherA = InputUntil.inputInteger("Enter voucher:",scanner);
                        voucher.set(0,voucherA);
                    break;
                case "2":
                    System.out.println("Total number of vouchers: "+sumVoucher);
                    int voucherB = InputUntil.inputInteger("Enter voucher:",scanner);
                        voucher.set(1,voucherB);
                    break;
                case "3":
                    System.out.println("Total number of vouchers: "+sumVoucher);
                    int voucherC = InputUntil.inputInteger("Enter voucher:",scanner);
                    if(voucherC<=sumVoucher){
                        voucher.set(2,voucherC);
                    }
                    break;
                case "4":
                    bookingSet.addAll(bookingList);
                    for (int i = 0; i < bookingSet.size(); i++) {
                    }
                    break;
            }
        }while (true);
    }

    @Override
    public void displayCustomer() {

    }

    @Override
    public void displayGetVoucher() {

    }

    public static void main(String[] args) {
        for (Booking in: bookingSet) {
            System.out.println(in);
        }
    }
}
