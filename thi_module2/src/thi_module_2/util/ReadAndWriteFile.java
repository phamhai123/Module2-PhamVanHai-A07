package thi_module_2.util;

import thi_module_2.model.AccountBank;
import thi_module_2.model.AccountPayment;
import thi_module_2.model.AccountSaving;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    public static void writeFile(ArrayList<AccountBank> list, String file) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i+1);
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (AccountBank lists: list
                ) {
                    bw.write(lists.Info());
                }
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static ArrayList<AccountBank> readFile(String file) {
        ArrayList<AccountBank> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            String temp[];
            String line;
            while ((line = buffered.readLine())!=null){
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                double code = Double.parseDouble(temp[1]);
                String name = temp[2];
                String dayCreate = temp[3];
                if(temp.length == 6){
                    double card = Double.parseDouble(temp[4]);
                    double coin = Double.parseDouble(temp[5]);
                    list.add(new AccountPayment(id, code, name, dayCreate, card, coin));
                }else if(temp.length == 8) {
                    double coinSave = Double.parseDouble(temp[4]);
                    String daySave = temp[5];
                    double interestRate = Double.parseDouble(temp[6]);
                    String dateSave = temp[7];
                    list.add(new AccountSaving(id, code, name, dayCreate, coinSave, daySave, interestRate, dateSave));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String[] args) {
        String file = "D:\\Module_02\\PhamVanHai-A0722i1\\thi_module2\\src\\thi_module_2\\data\\dataaccount.csv";
    }
}
