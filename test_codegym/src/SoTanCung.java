import java.util.ArrayList;
import java.util.List;

public class SoTanCung {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        for (int i = 1; i <= a ; i++) {
            b*=i;
        }
        String c = String.valueOf(b);
        String[] d = c.split("");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            if (Integer.parseInt(d[i]) != 0){
                list.add(Integer.parseInt(d[i]));
            }
        }
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
    }
}
