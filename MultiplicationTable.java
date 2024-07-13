// Created By Rajanish Bhagat

import java.util.Scanner;
 
class MultiplicationTable
{
  public static void main(String args[])
  {
    int n, i;
    System.out.println("Enter an integer to print it's multiplication table");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println("Multiplication table of " + n);
 
    for (i = 1; i <= 10; i++)
      System.out.println(n + "*" + i + " = " + (n*i));
  }
}
