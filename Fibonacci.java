// Created By Rajanish Bhagat

//In Fibonacci series, next number is the sum of previous two numbers. The first two numbers of Fibonacci series are 0 and 1
// The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ... 

import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
