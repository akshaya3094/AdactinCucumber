package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotelPage;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName: " + name);
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("        ScenarioStatus: " + status);
		if(scenario.isFailed()) {
			getScreenshot(scenario.getName());
		}
	}
	
	/*
	 * @When("^User log into the application$") public void
	 * user_log_into_the_application() throws Throwable {
	 * System.out.println("Adactin application"); }
	 */
	
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		String pageUrl = FileReaderManager.getInstance().getCrInstance().getPageUrl();
		getUrl(pageUrl);
	}

	@When("^User enters valid username \"([^\"]*)\" in username field$")
	public void user_enters_valid_username_in_username_field(String username) throws Throwable {
		inputToElement(pom.getLoginPage().getLoginUsername(), username);
	}

	@When("^User enters valid password \"([^\"]*)\" in password field$")
	public void user_enters_valid_password_in_password_field(String password) throws Throwable {
		inputToElement(pom.getLoginPage().getLoginPassword(), password);
	}

	@When("^User clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		clickOnElement(pom.getLoginPage().getLoginBtn());
	}

	@Then("^User verifies homepage navigates to search hotel page$")
	public void user_verifies_homepage_navigates_to_search_hotel_page() throws Throwable {
		Assert.assertEquals("A", "a");
	}

	@When("^User selects the location \"([^\"]*)\"$")
	public void user_selects_the_location(String location) throws Throwable {
		selectDropDown(pom.getSearchHotelPage().getLocation(), location, "value");
	}

	@When("^User selects the hotel \"([^\"]*)\"$")
	public void user_selects_the_hotel(String hotel) throws Throwable {
		selectDropDown(pom.getSearchHotelPage().getHotel(), hotel, "value");
	}

	@When("^User selects the room type \"([^\"]*)\"$")
	public void user_selects_the_room_type(String roomtype) throws Throwable {
		selectDropDown(pom.getSearchHotelPage().getRoomType(), roomtype, "text");
	}

	@When("^User selects the number of rooms \"([^\"]*)\"$")
	public void user_selects_the_number_of_rooms(String numberOfRooms) throws Throwable {
		selectDropDown(pom.getSearchHotelPage().getNumberOfRooms(), numberOfRooms, "value");
	}

	@When("^User enters check in date \"([^\"]*)\"$")
	public void user_enters_check_in_date(String checkInDate) throws Throwable {
		inputToElement(pom.getSearchHotelPage().getCheckInDate(), checkInDate);
	}

	@When("^User enters check out date \"([^\"]*)\"$")
	public void user_enters_check_out_date(String checkOutDate) throws Throwable {
		inputToElement(pom.getSearchHotelPage().getCheckOutDate(), checkOutDate);
	}


	@When("^User selects adults per room \"([^\"]*)\"$")
	public void user_selects_adults_per_room(String adultsPerRoom) throws Throwable {
		selectDropDown(pom.getSearchHotelPage().getAdultsPerRoom(), adultsPerRoom, "value");
	}

	@When("^User selects children per room \"([^\"]*)\"$")
	public void user_selects_children_per_room(String childPerRoom) throws Throwable {
		selectDropDown(pom.getSearchHotelPage().getChildPerRoom(), childPerRoom, "value");
	}

	@When("^User clicks search button$")
	public void user_clicks_search_button() throws Throwable {
		clickOnElement(pom.getSearchHotelPage().getSubmitBtn());
	}

	@Then("^User verifies search hotel page navigates to select hotel page$")
	public void user_verifies_search_hotel_page_navigates_to_select_hotel_page() throws Throwable {
		
	}

	@When("^User makes hotel selection$")
	public void user_makes_hotel_selection() throws Throwable {
		clickOnElement(pom.getSelectHotelPage().getSelectHotelBtn());
	}

	@When("^User clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
		clickOnElement(pom.getSelectHotelPage().getContinueBtn());
	}

	@Then("^User verifies select hotel page navigates to book hotel page$")
	public void user_verifies_select_hotel_page_navigates_to_book_hotel_page() throws Throwable {
		//Assert.assertEquals("B", "b");
	}

	@When("^User enters first name \"([^\"]*)\"$")
	public void user_enters_first_name(String firstName) throws Throwable {
		inputToElement(pom.getBookHotelPage().getFirstName(), firstName);
	}

	@When("^User enters last name \"([^\"]*)\"$")
	public void user_enters_last_name(String lastName) throws Throwable {
		inputToElement(pom.getBookHotelPage().getLastName(), lastName);
	}


	@When("^User enters billing address \"([^\"]*)\"$")
	public void user_enters_billing_address(String billingAddress) throws Throwable {
		inputToElement(pom.getBookHotelPage().getBillingAddress(), billingAddress);
	}

	@When("^User enters card number \"([^\"]*)\"$")
	public void user_enters_card_number(String cardNumber) throws Throwable {
		inputToElement(pom.getBookHotelPage().getCardNumber(), cardNumber);
	}

	@When("^User selects card type \"([^\"]*)\"$")
	public void user_selects_card_type(String cardType) throws Throwable {
		selectDropDown(pom.getBookHotelPage().getCardType(), cardType, "value");
	}

	@When("^User selects expiry month \"([^\"]*)\"$")
	public void user_selects_expiry_month(String expiryMonth) throws Throwable {
		selectDropDown(pom.getBookHotelPage().getExpiryMonth(), expiryMonth, "text");
	}

	@When("^User selects expiry year \"([^\"]*)\"$")
	public void user_selects_expiry_year(String expiryYear) throws Throwable {
		selectDropDown(pom.getBookHotelPage().getExpiryYear(), expiryYear, "value");
	}

	@When("^User enters CVV number \"([^\"]*)\"$")
	public void user_enters_CVV_number(String cvvNumber) throws Throwable {
		inputToElement(pom.getBookHotelPage().getCvvNumber(), cvvNumber);
	}

	@When("^User clicks book now button$")
	public void user_clicks_book_now_button() throws Throwable {
		BookHotelPage bookHotel = new BookHotelPage(driver);
		clickOnElement(bookHotel.getBookNowBtn());
	}

	@Then("^User verifies book hotel page navigates to booking confirmation page$")
	public void user_verifies_book_hotel_page_navigates_to_booking_confirmation_page() throws Throwable {

	}

	@When("^User clicks My Itenary button$")
	public void user_clicks_My_Itenary_button() throws Throwable {
		clickOnElement(pom.getBookingConfirmPage().getMyItenaryBtn());
	}

	@Then("^User verifies booking confirmation page navigates to booked itenary page$")
	public void user_verifies_booking_confirmation_page_navigates_to_booked_itenary_page() throws Throwable {

	}

	@When("^User clicks logOut button$")
	public void user_clicks_logOut_button() throws Throwable {
		clickOnElement(pom.getBookedItenaryPage().getLogOutBtn());
	}

	@Then("^User verifies successful logout$")
	public void user_verifies_successful_logout() throws Throwable {

	}

}
