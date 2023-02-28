import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        int[] list = {1, 2, 3, 4, 5};
//        for (int in : list
//        ) {
//            arr.add(in);
//        }
//        miniMaxSum(arr);
//        TreeMap<Integer,String> treeMap = new TreeMap<>();
//        treeMap.firstKey();
//        treeMap.lastKey();
//        String temp;
//        temp = treeMap.get(treeMap.lastKey());
//        treeMap.put(treeMap.firstKey(),treeMap.get(treeMap.lastKey()));
//        treeMap.put(treeMap.lastKey(),treeMap.get(temp));
//        System.out.println(utopianTree(5));
//        System.out.println(timeConversion("12:45:54PM"));
//        extraLongFactorials(25);
        TreeSet<String> list = new TreeSet<>();
        list.add("hai");
        list.add("hai");
        list.add("hao");
        list.add("hoa");
        list.add("hanh");
        list.add("hung");
        list.add("hieu");
        System.out.println(list);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Integer> arrSum = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    sum += arr.get(j);
                }
            }
            arrSum.add(sum);
            sum = 0;
        }
        int max = arrSum.get(0);
        int min = arrSum.get(0);
        for (int i = 0; i < arrSum.size(); i++) {
            if (max <= arrSum.get(i)) {
                max = arrSum.get(i);
            }
            if (min >= arrSum.get(i)) {
                min = arrSum.get(i);
            }
        }
        System.out.println(min + " " + max);
        System.out.println(arrSum);
    }

    public static void miniMaxSu(List<Integer> arr) {
        long min = 0, max = 0, sum = 0;
        min = max = sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        long max = candles.get(0);
        int old = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (max < candles.get(i)) {
                max = candles.get(i);
            }
        }
        for (Integer in : candles
        ) {
            if (in == max) {
                old += 1;
            }
        }
        return old;
    }

    public static int utopianTree(int n) {
        // Write your code here
        int tree = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tree += 1;
            } else {
                tree += tree;
            }
        }
        return tree;
    }

    public static String timeConversion(String s) {
        // Write your code here
        String time = "";
        String timeTrue = "";
        String[] checkTime = s.split("");
        for (int i = 0; i < checkTime.length - 2; i++) {
            time += checkTime[i];
        }
        String[] timeArr = time.split(":");
        List<String> timeList = new ArrayList<>();

        for (String in : timeArr) {
            timeList.add(in);
        }
        System.out.println(timeList);
        if (s.contains("P")) {
            if (timeList.get(0).equals("12")) {
                return "12" + ":" + timeList.get(1) + ":" + timeList.get(2);
            }
            timeTrue += Integer.valueOf(timeList.get(0)) + 12 + ":" + timeList.get(1) + ":" + timeList.get(2);
        } else if (s.contains("A")) {
            if (timeList.get(0).equals("12")) {
                return "00" + ":" + timeList.get(1) + ":" + timeList.get(2);
            } else {
                timeTrue += timeList.get(0) + ":" + timeList.get(1) + ":" + timeList.get(2);
            }
        }
        return timeTrue;
    }

    public static int findDigits(int n) {
        // Write your code here
        int digit = 0;
        String charDigit = String.valueOf(n);
        String[] arr = charDigit.split("");
        List<Integer> list = new ArrayList<>();
        for (String in : arr) {
            list.add(Integer.parseInt(in));
        }
        for (Integer in : list) {
            if (in != 0 && n % in == 0) {
                digit++;
            }
        }
        return digit;
    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger core = BigInteger.valueOf(n);
        for (int i = n - 1; i > 0; i--) {
            core = core.multiply(BigInteger.valueOf(i));
        }
        System.out.println(core);
    }
}