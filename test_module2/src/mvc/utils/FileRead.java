package mvc.utils;

import mvc.models.ATMCard;
import mvc.models.BankCard;
import mvc.models.CreditCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    private static String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\test_module2\\src\\mvc\\data\\card.txt";

    public static List<BankCard> readFromFile(){
        List<BankCard> bankCardList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = "";
            String temp[];
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String numberCard = temp[0];
                String nameCard = temp[1];
                String CCCD = temp[2];
                String address = temp[3];
                if(temp.length == 5){
                    double balance = Double.parseDouble(temp[4]);
                    bankCardList.add(new ATMCard(numberCard,nameCard,CCCD,address,balance));
                } else if (temp.length == 6) {
                    double debt = Double.parseDouble(temp[4]);
                    double creditLimit = Double.parseDouble(temp[5]);
                    bankCardList.add(new CreditCard(numberCard,nameCard,CCCD,address,debt,creditLimit));
                }
            }
        }catch (Exception e){
            System.out.println("Error!");
        }
        return bankCardList;
    }
}
