package com.java.CoreProgram;

import java.util.Scanner;
//Find Largest Among Three Numbers
public class LargeNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if( n1 >= n2 && n1 >= n3 )
        {
            System.out.println(n1 + " is the Largest Number");
        }
        else if( n2 >= n1 && n2 >= n3 )
        {
            System.out.println(n2 + " is the Largest Number");
        }
        else
        {
            System.out.println(n3 + " is the Largest Number");
        }
    }
}
