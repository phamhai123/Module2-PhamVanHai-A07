public class SoLaMa {
    public static void main(String[] args) {
        System.out.println(sovle("MCMXCIV"));
    }

    public static int sovle(String s) {
        // Write your code here
        String[] str = s.split("");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("I")) {
                a[i] = 1;
            } else if (str[i].equals("V")) {
                a[i] = 5;
            } else if (str[i].equals("X")) {
                a[i] = 10;
            } else if (str[i].equals("L")) {
                a[i] = 50;
            } else if (str[i].equals("C")) {
                a[i] = 100;
            } else if (str[i].equals("D")) {
                a[i] = 500;
            } else if (str[i].equals("M")) {
                a[i] = 1000;
            }
        }
        for (int in: a
             ) {
            System.out.println(in);
        }
        int k = a[str.length - 1];
        System.out.println(k);
        for (int i = str.length - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                k = k - a[i - 1];
            } else if (a[i] == a[i - 1] || a[i] < a[i - 1]) {
                k = k + a[i - 1];
            }
        }
        return k;
    }
}
