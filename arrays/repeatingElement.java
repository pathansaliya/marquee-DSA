import java.util.*;
public class repeatingElement {
    public static int duplicates(int arr[]){
        int max=0;
        int distance=0;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    distance=j-i;
                    if(max<distance)
                        max=distance;
                    }
            }

        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(duplicates(arr));
    }
}
