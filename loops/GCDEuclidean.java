package loops;

import java.util.*;

public class GCDEuclidean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        while (divisor != 0) {

            int rem = dividend % divisor;

            dividend = divisor;
            divisor = rem;
        }

        System.out.println(dividend);

        sc.close();
    }
}
