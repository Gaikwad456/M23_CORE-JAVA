package com.capgemini.Queue;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExample 
{
  @SuppressWarnings("rawtypes")
public static void main(String args[])
   {

     Set s= new LinkedHashSet();
     s.add(23);
     s.add("Komal");
     s.add(null);
     System.out.println(s);

   }

}
