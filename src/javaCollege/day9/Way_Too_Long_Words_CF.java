package javaCollege.day9;

import java.util.*;
public class Way_Too_Long_Words_CF {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String str = sc.next();
            if (str.length() >= 10) {
                sb.append(str.charAt(0));
                sb.append(str.length() - 2);
                sb.append(str.charAt(str.length()- 1));
                System.out.println(sb.toString());
            } else {
                System.out.println(str);
            }
        }
    }
}
