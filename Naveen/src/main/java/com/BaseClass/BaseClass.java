package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	//WebDriver methods
	public static void LaunchBrowser() {
//		System.setProperty("webdriver.chrome.driver",
//		System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	public static void LaunchUrl(String Url) {
		driver.get(Url);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}
	public static void closeWindow() {
		driver.close();
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void getWindowHandle() {
		driver.getWindowHandle();
	}
	public static void getWindowHandles() {
		driver.getWindowHandles();
	}
	//Navigate
	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}
	public static void refreshWebPage() {
		driver.navigate().refresh();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void back() {
		driver.navigate().back();
	}
	//WebElement methods
	public static void sendkeys(WebElement element, String name) {
		element.sendKeys(name);
	}
	public static void getText() {
		element.getText();
	}
	public static void  getAttribute(String attribute) {
		element.getAttribute(attribute);
	}
	public static void clear() {
		element.clear();
	}
	public static void isDisplayed() {
		element.isDisplayed();
	}
	public static void isSelected() {
		element.isSelected();
	}
	public static void isEnabled() {
		element.isEnabled();
	}
	public static void selectByindex(WebElement element , int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void selectByValue(WebElement element , String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element , String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	//Screenshot
	public static void screenShot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ganesh\\eclipse-workspace\\JavaProgram\\Selenium\\ScreenShot");
		FileUtils.copyFile(src, des);
	}
}
