package com.qa.randomprojects.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
 
  @Test
  @Parameters("surname")
  public void parameterPass(String str) {
	  
	  System.out.println(str);
	  
  }
}
