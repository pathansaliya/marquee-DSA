package loops;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum;

        System.out.print(a + " ");

        int i = 1;

        while (i < num) {

            sum = a + b;

            System.out.print(sum + " ");

            b = a;
            a = sum;

            i++;
        }

        sc.close();
    }
}
