import java.util.*;
public class binaryToDecimal{
    public static void main(String[]rags){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int binary=0;
        int place=1;
        while(n>0){
            int rem=n%10;
            binary=binary+(rem*place);
            place*=2;
            n=n/10;
        }
        System.out.println(binary);
    }
}