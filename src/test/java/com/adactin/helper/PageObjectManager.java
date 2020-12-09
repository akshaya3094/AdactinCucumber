package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotelPage;
import com.adactin.pom.BookedItenaryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private BookedItenaryPage bookedItenaryPage;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage ;
	}

	public SearchHotelPage getSearchHotelPage() {
		searchHotelPage = new SearchHotelPage(driver);
		return searchHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		selectHotelPage = new SelectHotelPage(driver);
		return selectHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		bookHotelPage = new BookHotelPage(driver);
		return bookHotelPage;
	}

	public BookingConfirmPage getBookingConfirmPage() {
		bookingConfirmPage = new BookingConfirmPage(driver);
		return bookingConfirmPage;
	}

	public BookedItenaryPage getBookedItenaryPage() {
		bookedItenaryPage = new BookedItenaryPage(driver);
		return bookedItenaryPage;
	}
	
}
