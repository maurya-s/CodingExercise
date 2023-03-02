package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.utilities.CalUtilities;

public class CodingExcerciseTest {
	WebDriver driver;
	CalUtilities util = new CalUtilities();

	@BeforeMethod
	public void setup() {
		// Launch the browser and enter URL
		util.launchBrowser();

	}

	@Test
	public void calEquationTest() {
		// Test for equation: (10-8) * 3
		util.calculation1("one", "zero", "three", "eight");		
		//WebElement actualValue = driver.findElement(By.id("display"));
		//Assert.assertEquals(actualValue, 66);
		
		
		

	}

	/*
	 * 66
	 * 
	 * @AfterMethod public void tearDown() { driver.close(); }
	 */

}
