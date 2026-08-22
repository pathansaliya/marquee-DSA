package contestQuestion;
import java.util.*;
public class question5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="hello";
        int j=0;
        int i=0;
        for(i=0;i<s.length();i++){
            if(j<str.length() && s.charAt(i)==str.charAt(j)){
                j++;
            }
        }
        if(j==str.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
