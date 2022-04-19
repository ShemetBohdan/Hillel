package lesson8;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 4;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(b);
    }
}

