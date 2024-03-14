package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		driver.findElement(By.xpath("//a[@class='sbSelector']")).click();
		driver.findElement(By.xpath("//a[@class='sbOptions']//li[3]//a[@rel='Credit Card']")).click();
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		driver.findElement(By.name("CCVNO")).sendKeys("333");
		driver.findElement(By.name("DOB")).click();
		
		Select yearDropDown =new Select(driver.findElement(By.className("ui-datepicker-year")));
		yearDropDown.selectByValue("2022");
		Select monthDropDown =new Select(driver.findElement(By.className("ui-datepicker-month")));
		monthDropDown.selectByValue("3");
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='14']")).click();
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		
	}

}
