package com.java.testing;
import java.util.*;

public class test{
    static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int rev = 0;
      int og = n;
      for(int i =1;i<=n;i++){
          int digit = n%10;
          rev = (rev *10) + digit;
          n =n/10;
      }
        System.out.println(rev);
      if(og == rev){
          System.out.println("yes");
      }
      else {
          System.out.println("no");
      }
}
}
