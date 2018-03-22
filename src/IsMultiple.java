import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsMultiple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "V:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ca.indeed.com/");
		driver.findElement(  By.id("text-input-what")).sendKeys("civil engineer");
		driver.findElement(By.className("icl-WhatWhere-button")).click();
		driver.getTitle();
		System.out.print(driver.getTitle());
		//driver.findElement(By.id("text-input-what")).sendKeys("civil engineer");
	}

}
