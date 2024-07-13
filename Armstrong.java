// Created By Rajanish Bhagat


/* Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:

153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number. */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {

        int num, number, rem, ans = 0, n = 0;
        System.out.println("Ënter 3 Digit Number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        num = number;
       
        while ( num != 0 )
        {
         num = num / 10;
         n++;
        }
        num = number;
        while (num != 0)
        {
          rem = num % 10;
          ans += Math.pow(rem, n);
          num = num / 10; 
        }

        if(ans == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
    }
}
