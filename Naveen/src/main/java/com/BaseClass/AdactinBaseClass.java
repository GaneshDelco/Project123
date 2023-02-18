package com.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBaseClass {	
	public static WebDriver driver;
	public static void getProperty() {
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
	}
	public static void SetUrl(String Url) {
		driver.get(Url);
	}
	public static void uname() {
		driver.findElement(By.id("username")).sendKeys("ganeshRko1");
	}
	public static void Pword() {
		driver.findElement(By.id("password")).sendKeys("Gmilgmil12");

	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void close() {
		driver.close();
	}
}
