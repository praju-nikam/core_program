package com.java.CoreProgram;

import java.util.Random;
import java.util.Scanner;
//Calculate the Percentage of Head & Tails

public class FlipCoin
{
    public static void main(String args[])
    {
        int  hcount = 0, tcount = 0,coin=0;
        double heads, tails;
        System.out.println("Enter Number of times you want to flip the Coin :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++)
        {
            if(coin == 1)
                System.out.println("Heads");
            else
                System.out.println("Tails");

            Random r = new Random();
            coin = r.nextInt(2);
            if( coin < 0.5 )
                tcount++;
            else
                hcount++;
        }
        System.out.println("Total Head : " +hcount);
        System.out.println("Total Tail : " +tcount);
        heads = (hcount/(double)n) * 100;
        tails = (tcount/(double)n) * 100;
        System.out.println("Percentage of Heads: " + heads );
        System.out.println("Percentage of Tails: " + tails);
    }
}
