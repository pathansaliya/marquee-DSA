import java.util.*;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;

        System.out.println("Choice 1 = '+', 2 = '-', 3 = '*', 4 = '/', 5 = '%'");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            case 5:
                System.out.println(a % b);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
