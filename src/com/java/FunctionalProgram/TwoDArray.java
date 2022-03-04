package com.java.FunctionalProgram;

import java.util.Scanner;
//2D Array
public class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2D Array Size");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.println("Enter Elements in Array : ");

        int twoD[][]=new int[rows][columns];


        for(int i=0; i < rows; i++)
        {
            for(int j=0; j < columns; j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n Data you entered : \n");

        for(int []x:twoD)
        {
            for(int y:x)
            {
                System.out.print(y+"        ");
            }
           System.out.println();
        }

    }

}

