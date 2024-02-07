package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
	public void openApplication() {
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     System.out.println(driver);
	    driver.navigate().to(url);
	    System.out.println("Applicatiion opened Successfully");
	}
	public void closeApplication() {
		
		driver.close();
		System.out.println("current page closed");
		driver.quit();
		System.out.println("Application closed");
	}
	public void login() throws Exception{
	
		 System.out.println(driver.getCurrentUrl());
		
	    driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		   Thread.sleep(2000);
	    driver.findElement(By.xpath(btn_login)).click();
		System.out.println("Login has Done");
	}
	public void logout() throws Exception {
		
		 System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		    Thread.sleep(2000);
		    System.out.println(driver.getCurrentUrl());
		    System.out.println("Logout has Done");
		 	Thread.sleep(2000);
	}
}
