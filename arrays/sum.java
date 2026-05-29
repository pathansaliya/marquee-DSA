import java.util.Scanner;

public class sum {
    static int[] sumExceptItself(int arr[]){
        int sum=0;
       
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int j=0;j<arr.length;j++){
               arr[j]=sum-arr[j];
                }
        return arr;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            } 
            int result[] = sumExceptItself(arr);

            for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            }

    }
}

