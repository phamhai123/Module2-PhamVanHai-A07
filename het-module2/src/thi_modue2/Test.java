package thi_modue2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
//        MyClass o = new ChuNhat();
//        ChuNhat a = new ChuNhat();
//
//        MyClass b = (MyClass) a;
//        Collections.sort(MyClass, new);
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (Integer in: hashMap.values()
//             ) {
//
//        }
        try {
            // Parses the date
            LocalDate dt = LocalDate.parse("02/01/2018");
            System.out.println(dt);

            // Function call
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            System.out.println(formatter.format(dt));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        Date input = new Date();
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
