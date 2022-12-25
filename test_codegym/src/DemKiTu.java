import java.util.ArrayList;
import java.util.List;

public class DemKiTu {
    public static void main(String[] args) {
        String a = "cabca";
        String[] b = a.split("");
        List<String> list = new ArrayList<>();
         for (String i: b
             ) {
             if (!list.contains(i)) {
                 list.add(i);
             }
         }
        System.out.println(list.size());
        for (String i: b
             ) {
            System.out.println(i);
        }
    }
}
