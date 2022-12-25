
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve("hellomyfriend"));
    }

    public static String solve(String planText) {
        // Write your code here
        String[] s = planText.split("");
        String count = "";
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i=s.length-1;i>=0;i--){
            if(map.containsKey(s[i])){
                int a = map.get(s[i])+1;
                map.put(s[i],a);
            }else{
                map.put(s[i],1);
            }
        }
        for(String key: map.keySet()){
            count +=  map.get(key)+key;
        }
        return count;
    }

}