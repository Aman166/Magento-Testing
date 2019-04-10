package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
		@Test
		public void method1()
		{
			     WebDriver driver=new ChromeDriver();
			     driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			     driver.get("https://magento.com");
			     driver.findElement(By.linkText("My Account")).click();
			     driver.findElement(By.id("email")).sendKeys("vineetanand61@gmail.com");
			     driver.findElement(By.id("pass")).sendKeys("Welcome123");
			     driver.findElement(By.id("send2")).click();
			     driver.findElement(By.linkText("Log Out")).click();
			    }

		

}
