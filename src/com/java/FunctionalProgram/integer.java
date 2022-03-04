package com.java.FunctionalProgram;

import java.util.Scanner;
//sum of Three Integer adds to zero
public class integer
{
    static void  findTriplets(int[] arr, int n)
    {  int count=0;
        boolean found = false;
        for (int i=0; i <n-2; i++)
        {
            for (int j=i+1; j <n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.println(" Ttiplets : " +arr[i]+ " " + arr[j] + " " + arr[k]);
                        found = true;
                        count++;

                    }
                }
            }
        }
        System.out.println("Total Number Of Triplets : " +count);
        if (found == false)
        {
            System.out.println(" No Triplets found ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Element Length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " Element In Array : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        findTriplets(arr,n);
    }
}
