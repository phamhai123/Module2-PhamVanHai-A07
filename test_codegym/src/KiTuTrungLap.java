import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KiTuTrungLap {
    public static void main(String[] args) {
        System.out.println(findChar("abcbdcef"));
    }
    public static List<String> findChar(String s) {
        // Write your code here
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] a = s.split("");
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){
                int count= map.get(a[i])+1;
                map.put(a[i],count);
            }else {
                map.put(a[i],1);
            }
        }
        for (String key : map.keySet()) {
             if(map.get(key) > 1){
                 list.add(key);
             }
        }
        if(list.size()==0){
            list.add("-1");
        }
        return list;
    }
}
