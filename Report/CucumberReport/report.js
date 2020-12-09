$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality of Adactin application",
  "description": "",
  "id": "booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1925700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user is able to login application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-user-is-able-to-login-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid username \"akshaya94\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters valid password \"Aj94may#\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies homepage navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 1433920800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "akshaya94",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enters_valid_username_in_username_field(String)"
});
formatter.result({
  "duration": 202282500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aj94may#",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enters_valid_password_in_password_field(String)"
});
formatter.result({
  "duration": 144204100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_login_button()"
});
formatter.result({
  "duration": 1624248500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_homepage_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 40800,
  "status": "passed"
});
formatter.before({
  "duration": 101600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify user is able to search hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-user-is-able-to-search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User selects the location \"London\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User selects the hotel \"Hotel Cornice\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User selects the room type \"Double\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User selects the number of rooms \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters check in date \"12/24/2020\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters check out date \"12/28/2020\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User selects adults per room \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User selects children per room \"0\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User verifies search hotel page navigates to select hotel page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_selects_the_location(String)"
});
formatter.result({
  "duration": 275363000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Cornice",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_selects_the_hotel(String)"
});
formatter.result({
  "duration": 229007000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_selects_the_room_type(String)"
});
formatter.result({
  "duration": 506882200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_selects_the_number_of_rooms(String)"
});
formatter.result({
  "duration": 478555200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/24/2020",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enters_check_in_date(String)"
});
formatter.result({
  "duration": 232981400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/28/2020",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enters_check_out_date(String)"
});
formatter.result({
  "duration": 323888000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_selects_adults_per_room(String)"
});
formatter.result({
  "duration": 281600700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_selects_children_per_room(String)"
});
formatter.result({
  "duration": 245900300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_search_button()"
});
formatter.result({
  "duration": 812202000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_search_hotel_page_navigates_to_select_hotel_page()"
});
formatter.result({
  "duration": 28700,
  "status": "passed"
});
formatter.before({
  "duration": 86600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify user is able to select hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-user-is-able-to-select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User makes hotel selection",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks continue button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verifies select hotel page navigates to book hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_makes_hotel_selection()"
});
formatter.result({
  "duration": 174630200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_continue_button()"
});
formatter.result({
  "duration": 654062300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_select_hotel_page_navigates_to_book_hotel_page()"
});
formatter.result({
  "duration": 21600,
  "status": "passed"
});
formatter.before({
  "duration": 118500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify user is able to book hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-user-is-able-to-book-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User enters first name \"Srinath\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User enters last name \"Ramesh\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enters billing address \"D-112,Spring Meadows,Wall Street,Munich,Germany\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters card number \"8765432112345678\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User selects card type \"VISA\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects expiry month \"May\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User selects expiry year \"2022\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enters CVV number \"689\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User clicks book now button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User verifies book hotel page navigates to booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Srinath",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_enters_first_name(String)"
});
formatter.result({
  "duration": 168035000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ramesh",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_last_name(String)"
});
formatter.result({
  "duration": 136437700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "D-112,Spring Meadows,Wall Street,Munich,Germany",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enters_billing_address(String)"
});
formatter.result({
  "duration": 250562900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8765432112345678",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_card_number(String)"
});
formatter.result({
  "duration": 143681300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_selects_card_type(String)"
});
formatter.result({
  "duration": 149485000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "May",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_selects_expiry_month(String)"
});
formatter.result({
  "duration": 190536800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_selects_expiry_year(String)"
});
formatter.result({
  "duration": 184524400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "689",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_enters_CVV_number(String)"
});
formatter.result({
  "duration": 124383100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_book_now_button()"
});
formatter.result({
  "duration": 153472100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_book_hotel_page_navigates_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 24700,
  "status": "passed"
});
formatter.before({
  "duration": 63800,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verify user is able to check booking confirmation",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-user-is-able-to-check-booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "User clicks My Itenary button",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User verifies booking confirmation page navigates to booked itenary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_My_Itenary_button()"
});
formatter.result({
  "duration": 6255145500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_booking_confirmation_page_navigates_to_booked_itenary_page()"
});
formatter.result({
  "duration": 17500,
  "status": "passed"
});
formatter.before({
  "duration": 67400,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Verify user is able to check booked itenary",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-user-is-able-to-check-booked-itenary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User clicks logOut button",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User verifies successful logout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_logOut_button()"
});
formatter.result({
  "duration": 541352800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_successful_logout()"
});
formatter.result({
  "duration": 19900,
  "status": "passed"
});
});