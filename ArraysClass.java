
// Java program to demonstrate 
// asList() method for String value 
// The asList() method of java.util.Arrays class is used to return a fixed-size list backed by the specified array. 
  
import java.util.*; 
  
public class GFG1 { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // creating Arrays of String type 
            String a[] = new String[] { "A", "B", "C", "D" }; 
  
            // getting the list view of Array 
            //List<String> list = Arrays.asList(a); 
            //int list = Arrays.asList(a); 
  
            // printing the list 
            System.out.println("The list is: " + Arrays.asList(a)); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 

/*Output is like :
The list is: [A, B, C, D]
*/

//----------------------------------------------------------------------------------------------------------------------------------------//

Arrays.sort() method is used to sort the array element
/*
import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {

      int iArr[] = {2, 1, 9, 6, 4};
      for (int number : iArr) {
         System.out.println("Number = " + number);
      }

      Arrays.sort(iArr);
      System.out.println("The sorted int array is:");
      for (int number : iArr) {
         System.out.println("Number = " + number);
      }
   }
}

Output : 

Number = 2
Number = 1
Number = 9
Number = 6
Number = 4
The sorted int array is:
Number = 1
Number = 2
Number = 4
Number = 6
Number = 9
*/

######################################################################################################################
import java.util.*;

class TestArray
{
public static void main(String args[])
{
int [] array = new int[]{9,12,24,43};

for ( int i=0;i<array.length;i++)
{
System.out.println(array[i]);
}
}
}

/*#################################################################################################################*/
Calculate the Average of the array element.
  
class TestArray
{
int sum = 0;

 void  average()
  {
    int [] arr = {9,12,24,43};

     for ( int i = 0; i<arr.length; i++)
      sum = sum + arr[i];

      float  average  = sum/arr.length;
     System.out.println("Sum is " +sum +"and Average is " +average);
  }
public static void main(String args[])
{
  TestArray obj = new TestArray();
       obj.average();

}
}

#####################################################################################################################

/**Sorting an array
*Compare the first two elements of the array
*If the first element is greater than the second swap them.
*Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
*Repeat this till the end of the array.
*After sorting an array print the 1st element from the end of the array.
*/
 
public class LargestNumberInAnArray {
   public static void main(String args[]){
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;
      
      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
             
            if(array[i]>array[j]){                  //this line of code only used to make ascending order.  if i will write like  if(array[i]<array[j])  work for descending order 
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
              
         }

         System.out.println(array[i]);
      }
      System.out.println("largest element is:: "+array[size-1]);
      
      System.out.println("Second largest element is:: "+array[size-2]);
      
       System.out.println("shortest  element is:: "+array[0]);
       
        System.out.println("shortest  element is:: "+array[1]);
   }
}

Output :


$javac LargestNumberInAnArray.java
$java -Xmx128M -Xms16M LargestNumberInAnArray
10
20
25
57
63
96
largest element is:: 96
Second largest element is:: 63
shortest  element is:: 10
shortest  element is:: 20


//Another solution: You can also sort the elements of the given array using the sort method of the java.util.Arrays class then,
 print the 1st element from the end of the array.

import java.util.Arrays;
public class LargestNumberSample {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      System.out.println("largest element is ::" + array[size-1]);
   }
}

$javac LargestNumberSample.java
$java -Xmx128M -Xms16M LargestNumberSample
sorted Array ::[10, 20, 25, 57, 63, 96]
largest element is ::96

// Find the Duplicate Element  in Array
  public class DuplicateElement {
   public static void main(String args[]){
      int temp, size;
      int array[] = {10, 20, 25, 63, 25, 96, 57};
      size = array.length;
      
      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
             
            if(array[i] == array[j]){
              System.out.println("Duplicate element is = " + array[j]);
            }
              
         }

         
      }

   }
}

$javac DuplicateElement.java
$java -Xmx128M -Xms16M DuplicateElement
Duplicate element is = 25

============================================================================================================================================================
// Take the value from input using Scanner class in the Array

package arraydemo;

import java.util.Scanner;

public class SingleDimensionArrayDemo {

	public static void main(String[] args) {
		  
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		  
		    n=sc.nextInt();  
		 
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		 
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  

		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		 
	}
  
========================================================================================================================================================
#MultiDimension Array :

package arraydemo;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		   
	
		int i,j;
		
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		  
		int r = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
  
		int c = sc.nextInt();   
		
		int array[][] = new int[r][c];   
		 
		System.out.println("Enter the elements of the array: ");   
		
		for (i = 0; i < r; i++)   
		{
		for ( j = 0; j < c; j++) 
		{
		array[i][j] = sc.nextInt(); 
		}
		System.out.println();  
		}
		
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < r; i++)   
		{   
		for (j = 0; j < c; j++)   
		{
		System.out.print(array[i][j] + " ");   
		}
		System.out.println();   
		}   
		}   

	}
