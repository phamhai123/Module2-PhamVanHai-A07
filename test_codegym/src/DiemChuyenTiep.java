import java.util.ArrayList;
import java.util.List;

public class DiemChuyenTiep {
    public static void main(String[] args) {
        String s = "0 0 0";
        String[] a = s.split(" ");

        List<Integer> arr = new ArrayList<>();
        for (String in : a
        ) {
            arr.add(Integer.parseInt(in));
        }
        System.out.println(solve(arr));
        
    }

    public static int solve(List<Integer> arr) {
        // Write your code here
        if (arr.size() >= 2) {
            for (int i = 1; i <arr.size(); i++){
                if (arr.get(i) != arr.get(i-1)) {
                    return  i;
                }
            }
        }
        return arr.get(0);
    }
}
