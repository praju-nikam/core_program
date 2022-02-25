package com.java.HarmonicNumber;

public class HarmonicNum
{
    static float nthHarmonic()
    {
        int n=0;
         float  harmonic = 1;

       //Hn = 1/1+1/2+.......1/n
      for (int i=1; i<=n; i++)
      {
          harmonic = harmonic + 1/i;
      }
        return harmonic;
    }
   public static void main(String args[])
    {
        int  n=8;
         System.out.println(nthHarmonic());
    }
}
