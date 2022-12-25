import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SapXepXauKiTu {
    public static void main(String[] args) {
        String s = "abc b aaa a zz";
        String[] a = s.split(" ");
        List<String> listA = Arrays.asList(s.split(" "));
        System.out.println(a[0].length());
        String b = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i].length() > a[j].length()){
                    String x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        for (String i: a
             ) {
            b += i + " ";
        }
        System.out.println(b);
    }
    public static int[] sort (int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        return a;
    }
}
