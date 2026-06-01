import java.util.*;

public class linearSearch {
    static boolean isPresent(int arr[],int target){
        int n=arr.length;
         for(int i=0;i<n;i++){
            if(arr[i]==target)
            return true;
           }
        return false;
    }
    static int findIndex(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int elementAtGivenIndex(int arr[],int i){
        return arr[i];
    }
    static int largestInArray(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int[] countOddEven(int arr[]){
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count1++;
            }else{
                count2++;
            }
            
        }
        int[] arr1={count1,count2};
            return arr1;
    }
    static int sumOfarray(int arr[]){
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println("avg: "+avg);
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       System.out.println(isPresent(arr,target));
       System.out.println("index: "+findIndex(arr,target));
       int index=sc.nextInt();
       System.out.println(elementAtGivenIndex(arr,index));
       System.out.println(largestInArray(arr));
       System.out.println(countOddEven(arr));
       System.out.println(sumOfarray(arr));
    }
}
