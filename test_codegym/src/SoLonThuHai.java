import java.util.ArrayList;
import java.util.List;

public class SoLonThuHai {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String s = "8 3 6 1 5 4";
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            list.add(Integer.parseInt(a[i]));
        }
        int max = Integer.MIN_VALUE;
        int max2 = max;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max2 = max;
                max = list.get(i);
            }
            if(list.get(i) < max && list.get(i) > max2){
                max2 = list.get(i);
            }
        }
        System.out.println(list.indexOf(max2));

//        for (int i: b
//             ) {
//            System.out.println(i);
//        }
    }
}
