import java.util.*;
public class chat_room {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="hello";
        int i=0;
        int j=0;
        while(i<s.length() && j<str.length()){
            if(s.charAt(i)==str.charAt(j)){
                j++;
            }
            i++;
        }
        if(j==str.length())
            System.out.print("YES");
        else
            System.out.print("NO");
       
    }
}
