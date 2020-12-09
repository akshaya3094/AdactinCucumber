package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {

	public static WebDriver driver;

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;

	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardNumber;

	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;

	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryMonth;

	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryYear;

	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNumber;

	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNowBtn;

	public BookHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

}
