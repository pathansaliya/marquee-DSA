import java.util.*;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Odd Even Check
        int n = sc.nextInt();

        if (n % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        // Boolean comparison examples
        // System.out.println(true > false); // Error

        System.out.println('a' > 'A'); // true
        System.out.println(true == false); // false
        System.out.println(true != false); // true

        // Floating point precision
        double d1 = 0.1 + 0.2;

        System.out.println(d1 == 0.3); // false

        // Relational operator chaining is not allowed
        // int x = 5;
        // int y = 3;
        // int z = 2;
        // System.out.println(x < y < z); // Error

        // Short circuit example
        int s = 10;

        if (s > 5 || ++s > 100) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
