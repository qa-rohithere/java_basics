// Created By Rajanish Bhagat

//Java if else program uses if else to execute statement(s) when a condition holds true. Below is a simple program which explains the usage of if else in Java programming language. 

import java.util.Scanner;
 
class IfElse {
  public static void main(String[] args) {
    int marksObtained, passingMarks;
   
    passingMarks = 40;
   
    Scanner input = new Scanner(System.in);
   
    System.out.println("Input marks scored by you");
   
    marksObtained = input.nextInt();
   
    if (marksObtained >= passingMarks) {
      System.out.println("You passed the exam.");
    }
    else {
      System.out.println("Unfortunately, you failed to pass the exam.");
    }
  }
}


//Nested If Else statements
/*
import java.util.Scanner;
 
class NestedIfElse {
  public static void main(String[] args) {
    int marksObtained, passingMarks;
    char grade;
   
    passingMarks = 40;
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Input marks scored by you");
 
    marksObtained = input.nextInt();
 
    if (marksObtained >= passingMarks) {
     
      if (marksObtained > 90)
        grade = 'A';
      else if (marksObtained > 75)
        grade = 'B';
      else if (marksObtained > 60)
        grade = 'C';
      else
        grade = 'D';
         
      System.out.println("You passed the exam and your grade is " + grade);
    }
    else {
      grade = 'F';
      System.out.println("You failed and your grade is " + grade);
    }
  }
}
*/
