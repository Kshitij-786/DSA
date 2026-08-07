package com.java.testing;
import java.util.*;

public class test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int digit = n % 10;
            if (digit == 0) {
                count++;
            }
                n = n / 10;
            }
            System.out.println(count);
        }
    }

