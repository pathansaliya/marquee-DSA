import java.util.*;

public class OperatorsDemo {
    public static void main(String[] args) {

        // Modulus operator examples
        System.out.println(10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % 3);
        System.out.println(-10 % -3);

        // Boolean comparison
        System.out.println(true == false);

        // Character comparison using ASCII values
        System.out.println('a' > 'A');

        // Floating point precision
        double d1 = 0.1 + 0.2;
        System.out.println(d1 == 0.3);

        // String concatenation
        System.out.println(20 + 30 + "Java");
        System.out.println("Java" + 20 + 30);

        // Character operations
        System.out.println('A' + "B");
        System.out.println('A' + 'B');

        System.out.println(5+5+"hello");
        System.out.println("hello"+5+5);
        System.out.println((float)10/3);
    }
}
