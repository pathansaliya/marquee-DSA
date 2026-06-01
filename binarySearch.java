
import java.util.*;
public class binarySearch {
    public static int binSearch(int arr[],int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(binSearch(arr,target));
    }
}
