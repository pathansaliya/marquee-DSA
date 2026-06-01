import java.util.Scanner;

public class summationOfArray {
    static int[] sum(int arr1[],int arr2[]){
        int[] arr3=new int[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        return arr3;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int n1=sc.nextInt();
            int[] arr1=new int[n1];
           for(int i=0;i<n1;i++){
                arr1[i]=sc.nextInt();
            }
            int n2=sc.nextInt();
             int[] arr2=new int[n2];
            for(int i=0;i<n2;i++){
                arr2[i]=sc.nextInt();
            }
            int result[]=sum(arr1,arr2);
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }

    }
}
