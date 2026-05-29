import java.util.*;
public class binaryToOctal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int decimal=0;
        int power=1;
        while(n>0){
            int rem=n%10;
            decimal=decimal+(rem*power);
            power*=2;
            n=n/10;
        }
        int octal = 0;
        int place = 1;
        while (decimal > 0) {
             int rem = decimal % 8;
             octal = octal + (rem * place);
            place *= 10;
            decimal = decimal / 8;
        }
        System.out.println(octal);
    }
}


