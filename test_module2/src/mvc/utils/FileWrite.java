package mvc.utils;

import mvc.models.BankCard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {
    private static String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\test_module2\\src\\mvc\\data\\card.txt";
    public static void writeToFile(List<BankCard> list) {
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (BankCard card : list) {
                buffer.write(card.getInfo());
                buffer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
