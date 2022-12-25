import java.util.ArrayList;
import java.util.List;

public class MangDep {
    public static void main(String[] args) {
        System.out.println(perfectArray("1 2 3 3"));
    }
    public static boolean perfectArray(String s) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        String[] a = s.split(" ");
        for (String i: a
        ) {
            list.add(Integer.parseInt(i));
        }
        int firt = 0;
        int end = 0;
        if(a.length >= 3){
            for (int i = 1; i < list.size()-1; i++) {
                for (int j = 0; j < list.size(); j++) {
                    if(i>j){
                        firt += list.get(j);
                    }else if(i<j){
                        end += list.get(j);
                    }
                    if(firt == end){
                        return true;
                    }
                }
                firt = end = 0;
            }
        }
        return false;
    }
}
