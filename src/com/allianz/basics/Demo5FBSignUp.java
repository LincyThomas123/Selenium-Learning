package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");

			//Click on create new account
			
//			driver.findElement(By.id("email")).sendKeys("Test.gmail.com");
//			
//			driver.findElement(By.id("pass")).sendKeys("Test");
//			
//			driver.findElement(By.id("loginbutton")).click();
			
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Lincy");
			driver.findElement(By.name("lastname")).sendKeys("Thomas");

			Select selectDay = new Select(driver.findElement(By.id("day")));
			selectDay.selectByVisibleText("11");
			
			Select selectMonth = new Select(driver.findElement(By.id("month")));
			selectMonth.selectByVisibleText("Apr");
			
			Select selectYear = new Select(driver.findElement(By.id("year")));
			selectYear.selectByVisibleText("1970");
	}

}
