// Created By Rajanish Bhagat


import java.util.Scanner;
 
class FloydTriangle
{
  public static void main(String args[])
  {
    int n, num = 1, i, j;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter the number of rows of Floyd's triangle to display");
    n = in.nextInt();
 
    System.out.println("Floyd's triangle:");
 
    for (i = 1; i <= n; i++)
    {
      for (j = 1; j <= i; j++)
      {
        System.out.print(num+" ");
        num++;
      }
 
      System.out.println(); // Moving to next row
    }
  }
}

/*  Output 
rajanish@netstorm-TECRA-C50-C:~/Rajanish/java$ javac FloydTriangle.java
rajanish@netstorm-TECRA-C50-C:~/Rajanish/java$ java FloydTriangle
Enter the number of rows of Floyd's triangle to display
5
Floyd's triangle:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
