public class arrayReverse {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 5, 0};

        reverse(arr, 0, 4);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}