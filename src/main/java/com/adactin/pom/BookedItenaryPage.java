package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenaryPage {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement searchHotelBtn;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelBtn;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logOutBtn;

	public BookedItenaryPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchHotelBtn() {
		return searchHotelBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

}
