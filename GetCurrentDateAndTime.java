// Created By Rajanish Bhagat
import java.util.Date;    
 public class DateToTimestampExample1 {    
       public static void main(String args[]){    
                Date date = new Date();  
                Timestamp ts=new Timestamp(date.getTime());  
                System.out.println(ts);                     
        }    
}    
//Output = > 2022-10-12 23:31:18.92



/*--------------------Another way to get Date and time in different format---------------------------------------------------*/

import java.util.Date;
import java.text.SimpleDateFormat;
class DateFormat
{
public static void main(String args [])
{
 Date dnow = new Date();
 SimpleDateFormat ft1 = new SimpleDateFormat("dd/MM/yyyy");
 SimpleDateFormat ft2 = new SimpleDateFormat("E");
 SimpleDateFormat ft3 = new SimpleDateFormat("hh:mm:ss a");
 SimpleDateFormat ft4 = new SimpleDateFormat("MMM");


 System.out.println(dnow);
 System.out.println("Current date is " + ft1.format(dnow));
 System.out.println("Today  is " + ft2.format(dnow));
 System.out.println("Current time is " + ft3.format(dnow));
 System.out.println("Current Month name is " + ft4.format(dnow));
}
}

/*
root@Cav-30-48:/home/cavisson/work/rajanish/java# javac  DateFormat.java 
root@Cav-30-48:/home/cavisson/work/rajanish/java# java  DateFormat 
Thu Apr 04 13:29:34 IST 2019
Current date is 04/04/2019
Today  is Thu
Current time is 01:29:34 PM
Current Month name is Apr

*/

===========================================================================================================

import java.util.Date;    
import java.text.SimpleDateFormat;  
 public class DateToTimestampExample2 {    
       public static void main(String args[]){    
                Date date = new Date();  
                Timestamp ts=new Timestamp(date.getTime());  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                System.out.println(formatter.format(ts));                     
        }    
}    
=======================================================================
//Java date and time program: Java code to print or display current system date and time. We are using GregorianCalendar class in our program. Don't use Date and Time classes of java.util package as their methods are deprecated, i.e., they may not be supported in the future versions of JDK. As an alternative of GregorianCalendar class you can use Calendar class.


import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
     
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
     
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}      


