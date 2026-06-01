package loops;

public class ForLoopExamples {
    public static void main(String[] args) {

        // Print numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Print even numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        // Print multiples of 3
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
