package com.java.CoreProgram;

import java.util.Scanner;
//Swap Two Numbers
public class SwapNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = sc.nextInt();
        System.out.println("Enter Second Number");
        int second = sc.nextInt();
        System.out.println("Before Swap Number = " +first +" , " +second);
        int temporary = first;
        first = second;
        second = temporary;
        System.out.println("After swap Number = " + first + " , " +second );

    }
}
