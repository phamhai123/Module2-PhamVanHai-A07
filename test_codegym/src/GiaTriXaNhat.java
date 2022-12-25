import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class GiaTriXaNhat {
    public static void main(String[] args) {
        List<Float> listA = new ArrayList<>();
        String s = "13.5 4456.23423423 723424.12 234234.1 534234.432 15.5";
        String[] a = s.split(" ");
        float x = 15.5F;
        int index = 0;
        float tmp;
        for (String i : a
        ) {
            listA.add(Float.parseFloat(i));
        }
        System.out.println(listA);
        float max =distance(listA.get(0), x);
        for (int i = 0; i < listA.size(); i++) {
            tmp = distance(listA.get(i),x);
            if(tmp>max){
                max = tmp;
                index = i;
            }
        }
        System.out.println(listA.get(index));
    }
    public static float distance(float a, float b){
        return abs(a-b);
    }
}
