import java.util.*;
public class geometricTriplet {
    public static void triplets(int arr[],int n){
        for(int j=1;j<n-1;j++){
            int i=j-1;
            while(i>=0){
                int k=j+1;
                while(k<n){
                    if(arr[j]*arr[j]==arr[i]*arr[k]){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                    k++;
                }
                i--;
            }
            
        }
        System.out.println("No triplet found")l
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        triplets(arr,n);
    }
}
