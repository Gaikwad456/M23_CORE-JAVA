package com.capgemini.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDao 
{
     public Connection createConnection()
     {
    	 String URL="jdbc:mysql://localhost:3306/tns1";
    	 String user="root";
         String password="Gaikwad990";
         try
         {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
         }
         catch(ClassNotFoundException e)
         {
        	 e.printStackTrace();
         }
         Connection c;
         try
         {
        	 c=DriverManager.getConnection(URL,user,password);
         }
         catch(SQLException e)
         {
        	 c=null;
         }
         return c;
     }
}
