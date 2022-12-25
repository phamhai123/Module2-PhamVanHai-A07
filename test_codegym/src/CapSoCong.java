import java.util.ArrayList;
import java.util.List;

public class CapSoCong {
    public static void main(String[] args) {
        String s = "1 4 7";
        List<Integer> list = new ArrayList<>();
        boolean set = true;
        String[] a = s.split(" ");
        for (String i: a
        ) {
            list.add(Integer.parseInt(i));
        }
        int level = list.get(1) - list.get(0);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if((list.get(i)+level)!=list.get(j)){
                    set = false;
                }
                break;
            }
        }
        System.out.println(set);
    }
}
