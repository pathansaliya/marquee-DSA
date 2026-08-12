import java.util.*;
public class Holiday {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int minHoliday=0;
        int maxHoliday=0;
        int weeks=days/7;
        minHoliday=weeks*2;
        maxHoliday=weeks*2;
        int remaining=days%7;
        if(remaining==6){
            minHoliday+=1;
        }
        if(remaining>=2){
            maxHoliday+=2;
        }else if(remaining==1){
            maxHoliday+=1;
        }
        System.out.print(minHoliday+" "+maxHoliday);
        sc.close();
    }
}
