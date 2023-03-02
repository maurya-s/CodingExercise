package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalUtilities {
	WebDriver driver;		

	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://duffmanns.github.io/calc-test/calculator/app/index.html");
	}

	public void calculation1(String x, String y, String z, String k) {

		driver.findElement(By.id(x)).click();
		driver.findElement(By.id(y)).click();
		driver.findElement(By.id("multiply")).click();
		driver.findElement(By.id(z)).click();

		driver.findElement(By.id("subtract")).click();

		driver.findElement(By.id(k)).click();
		driver.findElement(By.id("multiply")).click();
		driver.findElement(By.id(z)).click();
		driver.findElement(By.id("equals")).click();

	}

}
