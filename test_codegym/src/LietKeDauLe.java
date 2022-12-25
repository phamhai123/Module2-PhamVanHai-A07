import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LietKeDauLe {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        List<List<Integer>> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        String s = "13 4456 723424 234234 534234";
        String[] a = s.split(" ");
        for (String i : a
        ) {
            listA.add(i);
        }
        listB.size();
        for (int i = 0; i < listA.size(); i++) {
            listB.add(i,isTwo(listA.get(i)));
        }
        for (int i = 0; i < listB.size(); i++) {
            if(listB.get(i).get(0) %2 != 0 ){
                listC.add(isBy(listB.get(i)));
            }
        }
        if (listC.size() == 0){
            System.out.println(-1);
        }
        System.out.println(listC);
    }
    public static Integer isBy(List<Integer> a){
        String b = "";
        for (Integer in: a
             ) {
            b+= in;
        }
        return Integer.parseInt(b);
    }
    public static List<Integer> isTwo(String a){
        String[] b = a.split("");
        List<Integer> list = new ArrayList<>();
        for (String i: b
             ) {
            list.add(Integer.parseInt(i));
        }
        return list;
    }

}
