package com.POMClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPom {

//	public LoginPom() {
//		
//		PageFactory.initElements(driver, this);
//
//	}
	@FindBy(id = "username")
	public static WebElement  userName;
	@FindBy(id = "password")
	public static  WebElement passWord;
	@FindBy(id = "login")
	public static  WebElement login;
	//search-hotel
	@FindBy(id = "location")
	public static WebElement loc;
	@FindBy(id ="hotels")
	public static WebElement hotels;
	@FindBy(id ="room_type")
	public static WebElement roomType;
	@FindBy(id = "room_nos")
	public static WebElement numberOfRooms;
	@FindBy(id = "datepick_in")
	public static WebElement checkInDate;
	@FindBy(id = "datepick_out")
	public static WebElement checkOutDate;
	@FindBy(id = "adult_room")
	public static WebElement adultsperRoom;
	@FindBy(id = "child_room")
	public static WebElement childrenPerRoom;
	@FindBy(id = "Submit")
	public static WebElement submit;
	//book-hotel
	@FindBy(id ="radiobutton_0")
	public static WebElement radioButton;
	@FindBy(id ="continue")
	public static WebElement continueToNextPage;
	//third
	@FindBy(id ="first_name")
	public static WebElement firstName;
	@FindBy(id ="last_name")
	public static WebElement LastName;
	@FindBy(id ="address")
	public static WebElement Address;
	@FindBy(xpath = "(//input[@type='text'])[13]")
	public static WebElement cardNumber;
	@FindBy(id ="cc_type")
	public static WebElement creditCard;
	@FindBy(id ="cc_exp_month")
	public static WebElement expiryMonth;
	@FindBy(id ="cc_exp_year")
	public static WebElement expiryYear;
	@FindBy(id ="cc_cvv")
	public static WebElement cvv;
	@FindBy(xpath = "(//input[@type='button'])[1]")
	public static WebElement button;
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	public static WebElement bookedItinerary;
}


