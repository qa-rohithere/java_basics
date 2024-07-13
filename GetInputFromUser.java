// Created By Rajanish Bhagat

//Java program to get input from a user: we are using Scanner class to get input from the user. This program asks the user to enter an integer, a float, and a string; then they are printed on the screen. Scanner class is present in java.util package so we import this package into our program. We first create an object of Scanner class and then we use the methods of Scanner class. Consider the statement
//  Scanner a = new Scanner(System.in);
/*
Here Scanner is the class name, a is the name of the object, new keyword is used to allocate the memory and System.in is the input stream. Following methods of Scanner class are used in the program:

1) nextInt to input an integer
2) nextFloat to input a float
3) nextLine to input a string
*/

import java.util.Scanner;
 
class GetInputFromUser
{
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
     
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer " + a);
     
      System.out.println("Enter a float");
      b = in.nextFloat();
      System.out.println("You entered float " + b);  
   
      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string " + s);
   }
}

