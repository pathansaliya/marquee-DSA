import java.util.*;
public class palindromeString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean valid=true;
        int a=0;
        int b=s.length()-1;
        while(a<b){
            if(!(s.charAt(a)==s.charAt(b))){
                System.out.println("Not palidrome");
                valid=false;
                break;
            }
            a++;
            b--;
        }
        if(valid)
        System.out.println("Palindrome");
    }
}
