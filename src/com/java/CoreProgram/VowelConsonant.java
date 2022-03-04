package com.java.CoreProgram;

import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet : ");
        char  check = sc.next().charAt(0);
        if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u')
        {
            System.out.println(check +" is Vowel");
        }
        else
        {
            System.out.println(check + " is Consonant");
        }
    }
}
