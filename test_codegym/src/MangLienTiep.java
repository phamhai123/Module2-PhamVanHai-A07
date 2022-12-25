import java.util.ArrayList;
import java.util.List;

public class MangLienTiep {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        String s = "6 2 3 8";
        String[] a = s.split(" ");
        for (String i: a
        ) {
            listA.add(Integer.parseInt(i));
        }
        int min = listA.get(0);
        int max = listA.get(0);
        for (int i = 0; i <listA.size() ; i++) {
            if(listA.get(i) > max){
                max = listA.get(i);
            }
            if(listA.get(i) < min){
                min = listA.get(i);
            }
        }
        for (int i = min; i < max; i++) {
            if(!listA.contains(i)){
                listB.add(i);
            }
        }
        System.out.println(min+ "/" + max);
        System.out.println(listB);
    }
}
