// Created By Rajanish Bhagat

//Java for loop is used to repeat execution of the statement(s) until a certain condition holds true. for is a keyword in Java programming language.
/* Java for loop syntax
for (Initialization  ; test expr; iteration) {
  // Statements to execute, i.e., Body of a for loop
}

// Infinite for loop
for ( ; ; ) {
  System.out.println("Java programming");
}

You can terminate an infinite loop by pressing Ctrl+C.
*/

//Java for loop program
class ForLoop {
  public static void main(String[] args) {
    int c;
   
    for (c = 1; c <= 10; c++) {
      System.out.println(c);
    }
  }
}


Write the program to increment with 3 using  for loop ?
      for(int i=1;i<=10;i+=3)
		{
			 System.out.println(i);    //1 4 7 10
		}


Infinite loop using while 
class B
{
public static void main (String args [])
{
while(true)
{
System.out.println("Rajanish Bhagat");
}
}
}

Output :  Rajanish Bhagat will print infinit time 
