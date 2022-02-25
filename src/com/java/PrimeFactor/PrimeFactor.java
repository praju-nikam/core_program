package com.java.PrimeFactor;

import java.util.Scanner;

public class PrimeFactor {
    public static void primeFact(int n)
    {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i*i <=n; i += 2) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
    }

    public static void main(String[] args) {
        int n ;
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        primeFact(n);
    }
}
