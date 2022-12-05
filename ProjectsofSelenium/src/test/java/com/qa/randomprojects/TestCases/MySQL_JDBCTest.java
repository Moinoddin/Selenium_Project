package com.qa.randomprojects.TestCases;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MySQL_JDBCTest {
  @Test
  public void f() throws SQLException {
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_student","root","6666");
	  
	  Statement stmt= con.createStatement();
	  
	  String que = "delete from student where id = 5";
	  
	  stmt.executeUpdate(que);
	  
	  con.close();
	  
	  System.out.println("Program is Exited");
	  
	  
	  
	  
  }
}
