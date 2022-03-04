package com.java.FunctionalProgram;

import java.util.Scanner;
//find the roots of equation
public class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Vlue a,b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double root1,root2;
        //calculate Determinant (b^2-4ac)
        int delta = b * b - 4 * a * c;
        System.out.println("Determinant :" +delta);
       if(delta > 0 )
       {
           root1 = (-b + Math.sqrt(delta)) / (2 * a);
           root2 = (-b - Math.sqrt(delta)) / (2 * a);
           System.out.println("The Roots root1 : "+root1);
           System.out.println("The Roots root2 : "+root2);
       }

        else if( delta == 0)
       {
            root1 = -b/(2*a);
           System.out.println("The Root is : "+root1);
       }
        else
       {
           System.out.println("Roots are not real");
       }

    }
}

