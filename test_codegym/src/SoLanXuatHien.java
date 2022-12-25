import java.util.*;

public class SoLanXuatHien {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        boolean set = true;
        String s = "1 2 2 1 3";
        int num = 0;
        String[] a = s.split(" ");
        for (String i: a
        ) {
            listA.add(Integer.parseInt(i));
        }
        for (int i = 0; i < listA.size(); i++) {
            if(map.containsKey(listA.get(i))){
                int count = map.get(listA.get(i))+1;
                map.put(listA.get(i),count);
            }else {
                map.put(listA.get(i),1);
            }
        }
        for (Integer value: map.values()
             ) {
            if (!listB.contains(value)){
                listB.add(value);
                num++;
            }
        }
        if(num == 1){
            return ;
        }
        System.out.println(num);
        for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
        }
    }
    public static boolean checkCountElement(String s) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        String[] a = s.split(" ");
        for (String i: a
        ) {
            list.add(Integer.parseInt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))){
                int count = map.get(list.get(i))+1;
                map.put(list.get(i),count);
            }else {
                map.put(list.get(i),1);
            }
        }
        for (Integer key : map.keySet()) {
            if(!map.containsValue(map.get(key))){
                return false;
            }
        }
        return true;
    }
}
