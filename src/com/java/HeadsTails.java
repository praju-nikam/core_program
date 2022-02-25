package com.java;

import java.util.Random;


public class HeadsTails
{
    public static void main(String args[])
    {
       int coin;
        Random r = new Random();
        coin = r.nextInt();
        if(coin == 1)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }
}

