package dsa;

import java.util.*;
public class someBasicProblem {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        /// Even odd w/o (%) approach 1

//        int n = sc.nextInt();
//        if((n/2)*2 == n){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        /// Even odd w/o (%) approach 2 via bit check if last binary bit = 0 is even, odd has bit = 1.
        //When used with integer data types (int, long, byte, etc.), the & operator compares the binary representation of two numbers bit by bit. It returns a 1 if both bits are 1, and 0 otherwise

        //it is much faster than (/) & (%)...
//        int n = sc.nextInt();
//        if((n & 1) == 1){
//            System.out.println("odd");
//        }
//        else {
//            System.out.println("even");
//    }
        /// Count even odd and their sum numbers
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
//                }  // seprate for even and odd
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


        /// sum of 1 to n natural numbers

//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 1;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

        ///  count digits of number

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

        ///  reverse a number

//        int n = sc.nextInt();
//            int rev = 0;
//            while(n!=0){
//                int digit = n%10;
//                rev = rev * 10 + digit;
//                n = n/10;
//            }
//        System.out.println(rev);


       /// check palindrome

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


        ///  largest digit in number

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

        /// Sum of Digits

//        int n = sc.nextInt();
//       int  num = Math.abs(n); // it turns negative to positive
//        int sum = 0;
//        while (num>0){
//            sum += num%10;
//            num = num/10;
//        }
//        System.out.println(sum);
//        System.out.println();


            /// Marks Grades
//            marks = sc.nextInt();
//
//            if(marks>=90){
//                System.out.println("Grade A");
//            }
//            else if(marks>=70){
//                System.out.println("Grade B");
//            }
//            else if(marks>=50){
//                System.out.println("Grade C");
//            }
//            else if(marks>=35){
//                System.out.println("Grade D");
//            }
//            else{
//                System.out.println("Fail");
//            }
    }
}


