package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public static WebDriver driver;

	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selectHotelBtn;

	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBtn;

	public SelectHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectHotelBtn() {
		return selectHotelBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
