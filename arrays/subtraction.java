import java.util.*;
public class subtraction {
    static int[] subtract(int arr1[],int arr2[]){
        String s1="";
        String s2="";
        for(int num:arr1){
            s1+=num;
        }
        for(int num:arr2){
            s2+=num;
        }
        int sub=Integer.parseInt(s1)-Integer.parseInt(s2);
        int a=Math.max(arr1.length,arr2.length);
        int ans[]=new int[a];
        int index=0;
        while(sub>0){
            ans[index++]=sub%10;
            sub/=10;
        }
        int result[]=new int[ans.length];
         index=0;
    for(int i=ans.length-1;i>=0;i--){
        result[index++]=ans[i];
    }
    return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int result[]=subtract(arr1,arr2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
