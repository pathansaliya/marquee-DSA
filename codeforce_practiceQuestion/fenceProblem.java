//package codeforce_practiceQuestion;
import java.util.*;
public class fenceProblem {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int sum=0;
        int finalMinSum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        finalMinSum=sum;
        int index=0;
        for(int i=1;i<=length-size;i++){
            sum=sum-arr[i-1]+arr[i+size-1];
            if(finalMinSum>sum){
                finalMinSum=sum;
                index=i;
            }
        }
        System.out.println(index+1);
        sc.close();
    }
}
