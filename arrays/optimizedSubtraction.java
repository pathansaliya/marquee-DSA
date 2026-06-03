import java.util.*;

public class optimizedSubtraction {

    static int[] subtraction(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int ans[] = new int[n1];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n1 - 1;
         while (i >= 0) {
            int d1 = arr1[i];
            int d2 = (j >= 0) ? arr2[j] : 0;
        if (d1 < d2) {
            int borrowIndex = i - 1;
            while (borrowIndex >= 0 && arr1[borrowIndex] == 0) {
                 arr1[borrowIndex] = 9;
                    borrowIndex--;
                }
                arr1[borrowIndex]--;
                d1 += 10;
            }
            ans[k] = d1 - d2;
            i--;
            j--;
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int result[] = subtraction(arr1, arr2);

        // remove leading zeros
        int start = 0;
        while (start < result.length - 1 && result[start] == 0) {
            start++;
        }

        for (int i = start; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}