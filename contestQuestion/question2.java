package contestQuestion;
import java.util.*;
public class question2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int ans=s.compareToIgnoreCase(t);
    if(ans>0)
        System.out.println("1");
    else if(ans<0)
        System.out.println("-1");
    else
        System.out.println("0");
    }  
}
