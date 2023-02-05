package mvc.service.Impl;

import mvc.model.booking.Contract;
import mvc.service.childservice.ContactService;
import mvc.utils.InputUntil;
import mvc.validate.RegexLibrary;

import java.util.TreeSet;

public class ContactServiceImpl implements ContactService, RegexLibrary {
    TreeSet<Contract> listContract = new TreeSet<>();

    @Override
    public void display() {
        for (Contract inList : listContract
        ) {
            System.out.println(inList);
        }
    }

    @Override
    public void create() {
        int idContract = InputUntil.inputInteger("Enter id contract:", scanner);
        String idBooking = InputUntil.inputString("Enter id Booking:", scanner);
        double deposit = InputUntil.inputDouble("Enter Advance deposit amount:",scanner);
        double sumPay = InputUntil.inputDouble("Enter total money:",scanner);
        String idCustomer = InputUntil.inputString("Input id customer :", scanner);
        listContract.add(new Contract(idContract,idBooking,deposit,sumPay,idCustomer));

    }

    @Override
    public void edit() {
        display();

    }

//    @Override
//    public void create() {
//
//    }
//
//    @Override
//    public void edit() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }
}
