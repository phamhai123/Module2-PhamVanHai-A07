import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ChuoiNT {
    public static void main(String[] args) {
        String s = "DaNang";
        String a = "QUERTYUIOPASDFGHJKLZXCVBNM";

        String[] b = s.split("");
        String mess = "";
        for (int i = 0; i < b.length; i++) {
            if(a.contains(b[i])&&i>0){
                mess += " " + b[i];

            }else {
                mess += b[i];
            }
        }
        System.out.println(mess.toLowerCase());
    }
}
