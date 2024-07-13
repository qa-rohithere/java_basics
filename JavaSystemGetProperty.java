
package com.journaldev.util;

import java.util.Properties;
import java.util.Set;

public class JavaSystemGetProperty {

public static void main(String[] args) 
{
Properties prop = System.getProperties();
Set<Object> keySet = prop.keySet();
for (Object obj : keySet) 
{
System.out.println("System Property: {" + obj.toString() + "=" + System.getProperty(obj.toString()) + "}");
}
}
}

/* Output of thw above program will be like 
System Property: {os.name=Linux}
System Property: {os.arch=amd64}
System Property: {user.home=/root}
*/

//Another Example 
/*
//The java.lang.System.getProperty(String key) method gets the system property indicated by the specified key.

import java.lang.*;

class GetProperty
{
public static void main(String args[])
{
String userdir = System.getProperty("user.dir");
System.out.println(userdir);

System.out.println(System.getProperty("os.name"));
}
}
*/
