import java.util.*;

public class ArrayMissingNumber {
    static void MissingNumber(int[] nums,int n){
        Arrays.sort(nums);

        int[] res = new int[n+1];
        for(int i = 0 ; i < n ; i++){
            res[nums[i]]++;
        }
        for(int i = 0 ; i < res.length ; i++){
            if(res[i] == 0) System.out.print(i + " ");
        }

    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MissingNumber(nums,n);

    }
}