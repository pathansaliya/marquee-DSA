import java.util.*;
public class waterMelon{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        for(int i=2;i<=weight/2;i++){
            int part1=weight/i;
            int part2=weight-part1;
            if(part1%2==0 && part2%2==0){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}