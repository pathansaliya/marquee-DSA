import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long ans1 = (n + a - 1) / a;
        long ans2 = (m + a - 1) / a;
        System.out.print(ans1 * ans2);
    }
}   