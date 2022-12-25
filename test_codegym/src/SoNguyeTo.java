import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoNguyeTo {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<List<Integer>> listC = new ArrayList<>();
        listC.add(0, Collections.singletonList(3));
        listC.add(0, Collections.singletonList(7));
        listC.add(0, Collections.singletonList(5));
        for (int i = 0; i < listC.size(); i++) {
            for (int j = 0; j < listC.get(i).size(); j++) {
                if (isPrime(listC.get(i).get(j)) == true) {
                    listA.add(listC.get(i).get(j));
                }

            }
        }
        Collections.sort(listA);
        for (int i = 0; i < listA.size(); i++) {
            if (!listB.contains(listA.get(i))) {
                listB.add(listA.get(i));
                listB.add(Integer.valueOf("\n"));
            }
        }
        if (listB.size() == 0){
            listB.add(-1);
        }

    }

    public static boolean isPrime(Integer a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i < a - 1; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static List<Integer> solve(List<List<Integer>> a) {
        // Write your code here
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if(isPrime(a.get(i).get(j)) == true){
                    listA.add(a.get(i).get(j));
                }

            }
        }

        int num = 0;
        Collections.sort(listA);
        for (int i = 0; i < listA.size(); i++) {
            if (!listB.contains(listA.get(i))){
                listB.add(listA.get(i));
                listB.add(Integer.valueOf("\n"));
            }
        }
        return listB;
    }
    public static List isRead(List<Integer> b){

        return b;
    }
}
