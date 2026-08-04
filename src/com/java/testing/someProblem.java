package com.java.testing;

import java.util.*;
public class someProblem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Even odd w/o (%) approach 1

//        int n = sc.nextInt();
//        if((n/2)*2 == n){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        // Even odd w/o (%) approach 2 via bit check if last binary bit = 0, odd has it = 1.
        //When used with integer data types (int, long, byte, etc.), the & operator compares the binary representation of two numbers bit by bit. It returns a 1 if both bits are 1, and 0 otherwise

        //it is much faster than (/) & (%)...
//        int n = sc.nextInt();
//        if((n & 1) == 1){
//            System.out.println("odd");
//        }
//        else {
//            System.out.println("even");
//    }
        // Count even odd numbers
//
//        int n = sc.nextInt();
//            int count = 0;
//            int odd = 0;
//            int sum = 0;
//            for(int i = 1;i<=n;i++){
//                if(i%2 ==0) {
//                    System.out.println(i);
//                    count++;
//                     sum = sum + i;
//                }
//            }
//        for(int i = 1;i<=n;i++){
//            if(i %2 !=0) {
//                System.out.println(i);
//                odd++;
//            }
//        }
//
//        System.out.println(count +  "even");
//        System.out.println(odd + "odd");
//        System.out.println(sum);


        // sum of 1 to n natural numbers

//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 1;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

          //  count digits of number

//        int n = sc.nextInt();
//        int count = 0;
//        if (n == 0) {
//            count = 1;
//        } else {
//            while (n > 0) {
//                n = n / 10;
//                count++;
//            }
//            System.out.println(count);
//        }

          //  reverse a number

//        int n = sc.nextInt();
//            int rev = 0;
//            while(n!=0){
//                int digit = n%10;
//                rev = rev * 10 + digit;
//                n = n/10;
//            }
//        System.out.println(rev);


        // check palindrome

//        int n = sc.nextInt();
//        int og = n; // after reverse n value is reversed
//        int rev = 0;
//        while(n!=0){
//            int digit = n%10;
//            rev = rev * 10 +digit;
//            n = n/10;
//        }
//        if(rev == og){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }


          //  largest digit in number

//        int n = sc.nextInt();
//        int largest  = 0;
//            while(n!=0){
//                int digit = n%10;
//                if(largest<digit){
//                    largest = digit;
//                }
//                    n= n/10;
//            }
//        System.out.println(largest);

    }
}

