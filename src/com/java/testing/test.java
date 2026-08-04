package com.java.testing;

import java.util.*;
public class test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
            int sum = 0;
            int product  = 1;
            for(;n>0;){
                int digit  = n%10;
                sum += digit;
                product *= digit;
                n /=10;
            }
        System.out.println(product - sum) ;
        }
    }

