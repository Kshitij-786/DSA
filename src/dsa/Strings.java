package dsa;

import java.util.*;
import java.lang.*;
public class Strings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// Reverse String
//        String str = "hello";
//        String rev = "";
//        for(int i = str.length()-1;i>-1;i--){
//            rev += str.charAt(i);
//        }
//        System.out.println(rev);

        /// Plaindrome

//            String str = sc.nextLine();
//            String rev = "";
//            boolean isPalindrome = false;
//            for(int i = str.length()-1;i>=0;i--){
//                rev += str.charAt(i);
//                }
//                if(str.equalsIgnoreCase(rev)){
//                    isPalindrome = true;
//
//            }
//            System.out.println(isPalindrome);

        /// palindrome --Two Pointer
//            String str = sc.nextLine();
//            boolean isPalinrome = true; //false
//           int l = 0, r = str.length()-1;
//           while(l<r){
//               //isPalinrome = true;
//               if(str.charAt(l) != str.charAt(r)){
//                   isPalinrome = false;
//                   break;
//               }
//               l++;
//               r--;
//           }
//            System.out.println(isPalinrome);

        String str = "apple";
            for(int i = 0;i<str.length();i++){
                int c = 0;
                boolean isDup = false;
                for(int j = 0;j<i;j++){
                    if(Character.toLowerCase(str.charAt(i) )== Character.toLowerCase(str.charAt(j))){
                        isDup = true;
                        break;
                    }
                }
                if(isDup) {
                    continue;
                }
            for(int j = 0;j<str.length();j++){
                if(Character.toLowerCase(str.charAt(i))== Character.toLowerCase(str.charAt(j))){
                    c++;
                }
            }
                System.out.println(str.charAt(i) + " = " + c);
            }
        }
    }
