import java.util.*;
public class longestSubstring {
    public static int substring(String s){
        int length=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            length=0;
            for(int j=i+1;j<s.length();j++){
                boolean isrepeated=false;
                for(int k=i;k<j;k++){
                    for(int l=k+1;l<=k;l++){
                    if(s.charAt(k)==s.charAt(l)){
                        isrepeated=true;
                        break;
                    }

                    length++;
                    maxLength=Math.max(maxLength,length);
                }
                if(isrepeated){
                    break;
                }
            }
        }   
        }
        return maxLength;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        System.out.println(substring(s));
    }
}
