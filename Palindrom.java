// Created By Rajanish Bhagat

import java.util.Scanner;

class Palindrom 

{

public static void main(String args[])

{

int n, rem,  rev = 0;

System.out.println("Enter the number to reverse ");

Scanner sct = new Scanner(System.in);

n = sct.nextInt(); //User Input
int number = n;
while( n != 0 )// Reversing a Number Entered

{

rem = n%10;

rev = rev * 10 + rem;

n = n/10;

}

if ( number == rev )
{
System.out.println(number + " is a palindrom number");
}
else
{
System.out.println(number + " is not a palindrom number");
}
}

}
