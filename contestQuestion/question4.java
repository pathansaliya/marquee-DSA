package contestQuestion;
import java.util.*;
public class question4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'|| ch=='O'|| ch=='Y' || ch=='E' || ch=='U' || ch=='I' || 
            ch=='a'|| ch=='o'|| ch=='y' || ch=='e' || ch=='u' || ch=='i'){
                continue;
            }else{
                if(Character.isUpperCase(ch))
                ans=ans+"."+Character.toLowerCase(ch);  
                else
                ans=ans+"."+ch;
            }
        }
        System.out.println(ans);
    }
}
