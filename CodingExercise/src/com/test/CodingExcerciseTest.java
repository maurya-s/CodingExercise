package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.utilities.CalUtilities;

public class CodingExcerciseTest {
	WebDriver driver;
	CalUtilities util = new CalUtilities();

	@BeforeMethod
	public void setup() {
		//Launch the browser and enter URL
		driver = util.launchBrowser();

	}

	@Test
	public void calEquationTest() {
		//Test for equation: (10-8) * 3		
		util.calculation(1, 0, 8, 3);		
		util.assertValue("66");

		//util.calculation1(1, 1, 8, 3);		
		//util.assertValue("75");

	}

	
	  @AfterMethod
	  public void tearDown() {
		  driver.close();
		  }
	 

}
