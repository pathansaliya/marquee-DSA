import java.util.*;
public class decimalToOctal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int binary=0;
        int place=1;
        while(n>0){
            int rem=n%8;
            binary=binary+(rem*place);
            place*=10;
            n=n/8;
        }
        System.out.println(binary);
    }
}

