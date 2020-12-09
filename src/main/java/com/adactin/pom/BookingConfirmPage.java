package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myItenaryBtn;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logOutBtn;

	public BookingConfirmPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyItenaryBtn() {
		return myItenaryBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

}
