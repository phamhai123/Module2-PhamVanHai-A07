package unnecessary;

import mvc.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    private static final String FILE_CSV = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\customer.csv";
    public static List<Customer> readFromFile() {
        List<Customer> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_CSV);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                String birthDay = temp[2];
                String sex = temp[3];
                double identityCard = Double.parseDouble(temp[4]);
                double phoneNumber = Double.parseDouble(temp[5]);
                String email = temp[6];
                String type = temp[7];
                String address = temp[8];
                list.add(new Customer(id,name,birthDay,sex,identityCard,phoneNumber,email,type,address));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeToFile(List<Customer> list) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_CSV);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            for (Customer customer: list
                 ) {
                buffer.write(customer.getInfo());
            }
            buffer.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
