package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
//		WebDriver driver=null;
//		String browser="edge";
//		
//		Object ChromeDriver;
//		if(browser.equalsIgnoreCase("ch"))
//		{ driver =new ChromeDriver();
//		}
//		else
//		{driver=new EdgeDriver();
//		}
//		}
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
