package mvc.utils;

import mvc.model.Customer;

import java.io.*;

public class ReadAndWrite {

    public static void writeObjectToFile(Customer obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }
    public static Customer readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Customer result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Customer) ois.readObject();
        }
        return result;
    }
}
