package unnecessary;

import mvc.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static final String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\employee.csv";

    public static void writeToFile(List<Employee> list) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(FILE_PATH);
            bw = new BufferedWriter(fw);
            for (Employee employee : list
            ) {
                bw.write(employee.getInfo());
            }

        } catch (IOException e) {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                System.out.println("File error!");
            }

        }
    }

    public static List<Employee> readFromFile() {
        List<Employee> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader buffered = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            while ((line = buffered.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                String birthDay = temp[2];
                String sex = temp[3];
                double identityCard = Double.parseDouble(temp[4]);
                double phoneNumber = Double.parseDouble(temp[5]);
                String email = temp[6];
                String level = temp[7];
                String position = temp[8];
                double salary = Double.parseDouble(temp[9]);
                list.add(new Employee(id, name, birthDay, sex, identityCard, phoneNumber, email, level, position, salary));
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        return list;
    }

}
