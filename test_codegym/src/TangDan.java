import java.util.ArrayList;
import java.util.List;

public class TangDan {
    public static void main(String[] args) {

        String s = "-1 150 190 170 -1 -1 160 180";
        String[] a = s.split(" ");
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        b = sort(b);
        String sort = "";
        for (int in : b) {
            sort += in + " ";
        }
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != -1 && a[j] != -1) {
                    if (a[i] > a[j]) {
                        int x = a[i];
                        a[i] = a[j];
                        a[j] = x;
                    }
                }

            }
        }
        return a;
    }
}

