import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrungLap {
    public static void main(String[] args) {
        System.out.println(solve("1 4 5 2 3", "1 2 3"));
    }
    public static String solve(String parentString, String childString) {
        // Write your code here
        String[] paren = parentString.split(" ");
        String[] child = childString.split(" ");
        Map<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < paren.length; i++) {
            if(map.containsKey(paren[i])){
                int count = map.get(paren[i])+1;
                map.put(paren[i],count);
            }else {
                map.put(paren[i],1);
            }
        }
        for (int i = 0; i < child.length; i++) {
            if(!map.containsKey(child[i])){
                return "0";
            }
        }
        for (String key : map.keySet()) {
//            System.out.printf("%s xuất hiện %d lần.\n", key, map.get(key));
            for (int i = 0; i < child.length; i++) {
                if(key.equals(child[i])){
                    list.add(map.get(key));
                }
            }
        }
        int result = list.get(0);
        for (Integer in: list
             ) {
            if(result>in){
                result = in;
            }
        }
        return String.valueOf(result);
    }
}
