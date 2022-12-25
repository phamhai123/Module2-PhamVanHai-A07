import java.util.ArrayList;
import java.util.List;

public class TungBinhCong {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arrB = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int sum = 0;
        for (Integer in: arr
             ) {
            sum += in;
        }
        int ags = sum/arr.size();
        int num = arr.get(0);
        for (Integer in: arr
             ) {
            if(in<ags&&in>num){
                num = in;
            }
        }
        arrB.add(ags);
        arrB.add(num);
        System.out.println(num);
    }
}
