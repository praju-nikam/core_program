package com.java.CoreProgram;

import java.util.Scanner;
//Check Number is Even or Odd
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println(num + " is Even Number");
        }
        else
        {
            System.out.println(num + " is Odd Number");
        }
    }
}
