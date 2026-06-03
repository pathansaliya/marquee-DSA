public class IfElseExamples {
    public static void main(String[] args) {

        int a = -7;

        if (a % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        int num = 20;

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        int x = 7;

        if (x > 5)
            System.out.println("A");

        if (x < 6)
            System.out.println("B");
        else
            System.out.println("C");
    }
}