package loops;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int original = num;

        while (num > 0) {

            int digit = num % 10;

            sum += (digit * digit * digit);

            num /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
