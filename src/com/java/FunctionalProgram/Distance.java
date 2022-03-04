package com.java.FunctionalProgram;
//Calculate Distance using Math.power Function
public class Distance
{
    public static void main(String args[])
    {
        // parse x- and y-coordinates from command-line arguments
        int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Distance from (" + x + "," + y + ") to (0,0) = " + distance);

    }
}
