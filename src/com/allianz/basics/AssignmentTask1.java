package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTask1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).click();

		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		
		driver.findElement(By.name("UserLastName")).click();

		driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		driver.findElement(By.name("UserTitle")).click();
		driver.findElement(By.xpath("//select[@name='UserTitle']/option[text()='IT Manager']")).click();
		driver.findElement(By.xpath("//div[@class=\"msaCheckbox checkboxInput section\"]/div/div/div[@class=\"checkbox-ui\"]")).click();
		driver.findElement(By.xpath("//select/option[text()='101 - 200 employees']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div/div/select/option[216]")).click();
		driver.findElement(By.xpath("//div/button[@name='start my free trial']")).click();
	}
}