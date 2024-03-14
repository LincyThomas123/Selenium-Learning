package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFBLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("Create new account")).click();	
		
		//enter username
//		driver.findElement(By.id("email")).sendKeys("Test.gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Test");
		//driver.findElement(By.name("login")).click();
		
		//driver.quit();
	}

}
