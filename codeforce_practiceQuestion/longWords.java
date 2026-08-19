import java.util.*;
public class longWords {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
       for(int i=0;i<arr.length;i++){
            String str=arr[i];
            int digit=str.length();
            String s=Integer.toString(digit-2);
            if(digit>10){
                arr[i]=str.charAt(0)+s+str.charAt(str.length()-1);
            }else{
                arr[i]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
