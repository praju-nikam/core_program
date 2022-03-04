package com.java.CoreProgram;

import java.util.Scanner;
//Calculate prime Factor
public class PrimeFactor
{
    public static void primeFact(int n)
    {
        for ( int i = 2; i <=n; i++ ) {

            while (n % i == 0)
            {
                System.out.print(i + " " );
                n=n/i;
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
