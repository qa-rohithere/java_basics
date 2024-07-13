// Created By Rajanish Bhagat

/*Java program to perform garbage collection: Free memory in Java virtual machine is printed and then garbage collection is done using gc method of RunTime class, freeMemory method returns the amount of free memory in JVM, getRunTime method is used to get reference of current RunTime object.*/

import java.util.*;
 
class GarbageCollection
{
   public static void main(String s[]) throws Exception
   {
      Runtime rs =  Runtime.getRuntime();
      System.out.println("Free memory in JVM before Garbage Collection = "+rs.freeMemory());
      rs.gc();
      System.out.println("Free memory in JVM after Garbage Collection = "+rs.freeMemory());
   }
}
