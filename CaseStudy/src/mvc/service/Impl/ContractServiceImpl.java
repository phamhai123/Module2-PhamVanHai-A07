package mvc.service.Impl;

import mvc.model.booking.Contract;
import mvc.service.childservice.ContactService;
import mvc.utils.FileRead;
import mvc.utils.FileWrite;
import mvc.utils.InputUntil;
import mvc.validate.RegexLibrary;

import java.util.*;

public class ContractServiceImpl implements ContactService, RegexLibrary {
    private static List<Contract> contractList = new ArrayList<>();
    private static Queue<Contract> contractQueue = new PriorityQueue<>();
    static {
        contractQueue.addAll(contractList);
    }
    @Override
    public void display() {
        for (Contract inList : contractList
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
        contractList.add(new Contract(idContract,idBooking,deposit,sumPay,idCustomer));
        FileWrite.writeToFileContract(contractList,FILE_CONTRACT);
    }
    @Override
    public void edit() {
        display();
        int idEdit = InputUntil.inputInteger("Enter id need edit:",scanner);
        for (int i = 0; i < contractList.size(); i++) {
            if(contractList.get(i).getIdContract()==idEdit) {
                String idBooking = InputUntil.inputString("Enter id Booking:", scanner);
                double deposit = InputUntil.inputDouble("Enter Advance deposit amount:", scanner);
                double sumPay = InputUntil.inputDouble("Enter total money:", scanner);
                String idCustomer = InputUntil.inputString("Input id customer :", scanner);
                contractList.set(idEdit, new Contract(idEdit, idBooking, deposit, sumPay, idCustomer));
            }
        }
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
//    public void delete() {k
//
//    }
}
