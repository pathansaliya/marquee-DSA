    import java.util.*;
    public class EvenNumberDistance {
        static int calculateDistance(int arr[]){
            int start=-1;
            int end=0;
            int min=Integer.MAX_VALUE;
            
            while(end<arr.length){
                if(arr[end]%2==0 ){
                    if(start!=-1){
                    int distance=end-start;
                    if(distance<min){
                        min=distance;
                    }
                }
                   start=end;
                }
                end++;
            }
            if(min==Integer.MAX_VALUE){
                return -1;
            }
                return min;
            
        }

        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
            System.out.println(calculateDistance(arr));
        }
    }
