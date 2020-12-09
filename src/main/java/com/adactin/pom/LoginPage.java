package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(xpath="//input[@id='username']")
	private WebElement loginUsername;

	@FindBy(xpath="//input[@id='password']")
	private WebElement loginPassword;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement loginBtn;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginUsername() {
		return loginUsername;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
