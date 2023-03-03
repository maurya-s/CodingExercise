
package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalUtilities {
	WebDriver driver;

	public WebDriver launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://duffmanns.github.io/calc-test/calculator/app/index.html");
		return driver;
	}

	//Calculation for equation:  p1&p2*p4 -p3*p4  (e.g. 10*3-8*3=66) 
	public void calculation(int p1, int p2, int p3, int p4) {

		String locatorArr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String x = locatorArr[p1];
		String y = locatorArr[p2];
		String z = locatorArr[p3];
		String k = locatorArr[p4];

		int firstValue = Integer.parseInt(Integer.toString(p1) + Integer.toString(p2)) * p4;

		driver.findElement(By.id(x)).click();
		assertValue(Integer.toString(p1));

		driver.findElement(By.id(y)).click();
		assertValue(Integer.toString(p1) + Integer.toString(p2));

		driver.findElement(By.id("multiply")).click();
		driver.findElement(By.id(k)).click();
		assertValue(Integer.toString(p4));

		driver.findElement(By.id("subtract")).click();
		assertValue(Integer.toString(firstValue));

		driver.findElement(By.id(z)).click();
		assertValue(Integer.toString(p3));

		driver.findElement(By.id("multiply")).click();
		driver.findElement(By.id(k)).click();
		driver.findElement(By.id("equals")).click();

	}

	//Assert with expected value
	public void assertValue(String expectedValue) {
		WebElement displayValue = driver.findElement(By.xpath("//*[@id=\"display\"]"));
		String actualValue = displayValue.getText();
		Assert.assertEquals(actualValue, expectedValue);
	}

}
