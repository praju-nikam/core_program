package com.java;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin
{
    public static void main(String args[])
    {
        int n = 0, hcount = 0, tcount = 0,coin;
        double heads, tails;
        System.out.println("Enter Number of times you want to flip the Coin :");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
             Random r = new Random();
              coin = r.nextInt();
            if( coin < 0.5 )
                tcount++;
            else
                hcount++;
        }
        heads = (hcount/n) * 100;
        tails = (tcount/n) * 100;
        System.out.println("Percentage of Heads: " + heads );
        System.out.println("Percentage of Tails: " + tails);
    }
}
