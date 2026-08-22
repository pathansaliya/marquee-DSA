package contestQuestion;
import java.util.*;
public class question3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int lowerCount=0;
    int upperCount=0;
    for(int i=0;i<s.length();i++){
        if(Character.isUpperCase(s.charAt(i)))
            upperCount++;
        else
            lowerCount++;
        }
    if(upperCount>lowerCount)
        s=s.toUpperCase();
    else
        s=s.toLowerCase();
    System.out.println(s);
    }
}
