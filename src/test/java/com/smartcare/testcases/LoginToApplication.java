package com.smartcare.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToApplication 
{
@Test
private void login()
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://freelance-learn-automation.vercel.app/login");
	
	driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
	driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
	driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Manage']")).isDisplayed(),"Manage option is not displayed");
	driver.quit();
}
}
