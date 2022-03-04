package com.java.CoreProgram;


//power of 2
public class PowerOf2
{
    public static void main(String args[])
    {
         //System.out.println("Enter a Number :");
         //Scanner sc = new Scanner(System.in);
         //parseInt Use command Line Argument

        int num = Integer.parseInt(args[0]);
        int mul=1;
        if (num > 31 )
        {
            System.out.println("Enter value less than 31");
        }
        else
        {
            for (int i = 1; i <= num; i++)
            {
                 //mul = mul * i;
                //System.out.println("Power of 2^ " +i+ " is : " +mul);
                 System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));

            }
        }
    }
}
