import java.util.ArrayList;
import java.util.List;

public class demVong {
    public static void main(String[] args) {
        int f = 9;
        int r = 13;
        int[] arr = {f,r};
    }
    public static int dem(int l, int r) {
        List<Integer> list = new ArrayList<>();
        if (1 >= l && r <= Math.pow(10, 18)&&l<=r){
            list.add(l);
            list.add(r);
        }
        return list.size();
    }
}
