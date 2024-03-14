package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2FB {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		// get the curent url and print it
		// get the title of the page and print it
		// get the pagesource and print it

		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
	
		
	
	}

}
