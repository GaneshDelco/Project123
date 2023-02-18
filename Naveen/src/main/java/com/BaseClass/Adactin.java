package com.BaseClass;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin  {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/"); 
		driver.findElement(By.id("username")).sendKeys("ganeshRko1");
		driver.findElement(By.id("password")).sendKeys("Gmilgmil12");
		driver.findElement(By.id("login")).click();
	 
		WebElement location = driver.findElement(By.id("location"));
		Select selectLocation=new Select(location);
		selectLocation.selectByVisibleText("Los Angeles");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select hotel=new Select(hotels);
		hotel.selectByVisibleText("Hotel Cornice");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select roomtype=new Select(roomType);
		roomtype.selectByVisibleText("Super Deluxe");
		     
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		Select room_no=new Select(numberOfRooms);
		room_no.selectByVisibleText("4 - Four");
		
		WebElement  checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("10/10/2022"); 
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();          
		checkOut.sendKeys("15/10/2022");
		
		WebElement adultsPerRoom = driver.findElement(By.id("adult_room")); 
		Select adult_room=new Select(adultsPerRoom);
		adult_room.selectByVisibleText("2 - Two");
		
		WebElement childrenPerRoom = driver.findElement(By.id("child_room"));
		Select child_room=new Select(childrenPerRoom);
		child_room.selectByVisibleText("2 - Two");
		
		driver.findElement(By.id("Submit")).click();
		//SecondPage
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		//ThirdPage
		driver.findElement(By.id("first_name")).sendKeys("Ganesh");
		driver.findElement(By.id("last_name")).sendKeys("R");
		driver.findElement(By.id("address")).sendKeys("Hotel Cornice");
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("8508348660866725");
		WebElement CreditCard = driver.findElement(By.id("cc_type"));
		Select cc=new Select(CreditCard);
		cc.selectByVisibleText("Master Card"); 
		
		WebElement ExpiryDate = driver.findElement(By.id("cc_exp_month"));
		Select date=new Select(ExpiryDate);
		date.selectByVisibleText("January");
		
		WebElement ExpiryYear = driver.findElement(By.id("cc_exp_year"));
		Select Year= new Select(ExpiryYear);
		Year.selectByVisibleText("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ganesh\\eclipse-workspace\\SeleniumCode\\Seleniumdemo\\ScreenShot\\project.png");
		FileHandler.copy(src, des);
	
	


	}

}
