package com.java.CoreProgram;

import java.util.Scanner;
//Calculate Harmonic Number
public class HarmonicNum
{

   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        double result = 0;
        double harmonic = 1;

        //Hn = 1/1+1/2+.......1/n
            for (int i=2; i<=n; i++)
            {
                harmonic = harmonic + (float)1/i;
                result = harmonic;
            }
         System.out.println(result);
    }
}
