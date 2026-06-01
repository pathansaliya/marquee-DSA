import java.util.*;
public class DecimalToBinary{
    public static void main(String[]rags){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int binary=0;
        int place=1;
        while(n>0){
            int rem=n%2;
            binary=binary+(rem*place);
            place*=10;
            n=n/2;
        }
        System.out.println(binary);
    }
}