package com.jbk.mangesh.dataprovider.lecture7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demologin {

	@Test

	public void test01(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///F:/1.IT_Domain/Java_Selenium_JBK/7.Brijmohan/Regular/0_Main%20Stuff/Selenium/Offline%20website/Offline%20website/Offline%20website/Offline%20website/index.html");

		driver.findElement(By.id("email")).sendKeys("kiran@gmail");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("//*[@id='form']/div[3]/div/button")).click();

	}

}
