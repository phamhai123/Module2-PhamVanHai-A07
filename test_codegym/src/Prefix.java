import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        String s = "1 2 3";
        String[] a = s.split(" ");
        for (String i: a
             ) {
            listA.add(Integer.parseInt(i));
        }
        int num = 0;
        for (int i = 0; i < listA.size(); i++) {
            listB.add(num+=listA.get(i));
        }
        System.out.println(listB);
    }
}
