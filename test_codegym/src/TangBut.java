import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TangBut {
    public static void main(String[] args) {
        System.out.println(getMoneyInvestment("3 2 1 1 3 3",10));

    }
    public static int getMoneyInvestment(String e, int n) {
        // Write your code here
        String[] s = e.split(" ");
        List<Integer> list = new ArrayList<>();

        for (String in: s) {
            list.add(Integer.parseInt(in));
        }
        int sell = list.get(0);
        int buy = list.get(0);
        int sum = n;
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0&&list.get(i)<sell){
                sell = list.get(i);
            }else if(list.get(i)>buy){
                buy = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0&&list.get(i)==sell){
                sum -= list.get(i);
            }else if(list.get(i)==buy&&i%2!=0){
                sum += list.get(i);
            }
        }
        return sum;
    }
}
