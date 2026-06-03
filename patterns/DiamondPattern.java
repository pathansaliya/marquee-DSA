import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int k = 1; k <= n - i; k++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
       // }
       int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst++;
            System.out.println();
        }
         nsp=1;
        
         nst=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp++;
            nst--;
           
            System.out.println();
        }

       

        sc.close();
    }
}
