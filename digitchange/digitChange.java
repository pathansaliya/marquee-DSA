import java.util.*;

public class digitChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String ans = "";
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i))
                ans += '1';
            else
                ans += '0';
        }
    System.out.println(Integer.parseInt(ans));
    }
}