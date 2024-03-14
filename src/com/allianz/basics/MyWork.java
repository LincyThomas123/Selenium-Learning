package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/a[@class='sbSelector']")).click();
		driver.findElement(By.xpath("//ul/li/a[@rel=\"Credit Card\"]")).click();
		driver.findElement(By.name("citiCard1")).sendKeys("4545");
		driver.findElement(By.name("citiCard2")).sendKeys("5656");
		driver.findElement(By.name("citiCard3")).sendKeys("8887");
		driver.findElement(By.name("citiCard4")).sendKeys("9998");
		driver.findElement(By.name("CCVNO")).sendKeys("100");
		driver.findElement(By.id("bill-date-long")).click();
		
		Select selectYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
		selectYear.selectByVisibleText("1980");
		Select selectMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
		selectMonth.selectByVisibleText("Aug");	
		driver.findElement(By.xpath("//td/a[text()='4']"));
		//driver.quit();
	
	}

}
