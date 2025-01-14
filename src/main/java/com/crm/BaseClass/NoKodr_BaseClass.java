package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoKodr_BaseClass 
{
	public static WebDriver driver=null;
	
	public static void navigateUrl()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://app-staging.nokodr.com/");
		
	}

	public static void closeWeb() {
		driver.quit();
	}
}
