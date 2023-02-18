package com.BaseClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends BaseClass{

	
	public static void main(String[] args) {

		

		WebDriverManager.chromedriver().setup();
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(c);
		LaunchUrl("https://openweathermap.org/");
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			System.out.println(string);
			
		}
		
	}
	
	

}
