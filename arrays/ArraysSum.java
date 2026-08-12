import java.util.*;
public class ArraysSum {
    static int[] sum(int arr1[],int arr2[]){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int ans[]=new int[Math.max(arr1.length,arr2.length)];
        int k=ans.length-1;
        int c=0;
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+c;
            ans[k]=sum%10;
            c=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int sum=arr1[i]+c;
            ans[k]=sum%10;
            c=sum/10;
            i--; k--;
        }
         while(j>=0){
            int sum=arr2[j]+c;
            ans[k]=sum%10;
            c=sum/10;
            j--; k--;
        }
      
        if(c!=0){
        int newAns[]=new int[ans.length+1];
        newAns[0]=c;
        for(int a=1;a<newAns.length;a++){
            newAns[a]=ans[a-1];
        }
        return newAns;
    }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[4];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[3];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[]=sum(arr1,arr2);

        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        sc.close();
    }
}
