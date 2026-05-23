package loops;

import java.util.*;

public class GCDNormalMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = 1;

        int n = Math.min(num1, num2);

        for (int i = 2; i <= n; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);

        sc.close();
    }
}
