Feature: Booking functionality of Adactin application

@SmokeTest
Scenario Outline: Verify user is able to login application
Given User launches the application
When User enters valid username "<username>" in username field
And User enters valid password "<password>" in password field
And User clicks login button
Then User verifies homepage navigates to search hotel page

Examples:
|username|password|
|AAA|111|
|BBB|222|
|akshaya94|Aj94may#|

Scenario: Verify user is able to search hotel
When User selects the location "London"
And User selects the hotel "Hotel Cornice"
And User selects the room type "Double"
And User selects the number of rooms "1"
And User enters check in date "12/24/2020"
And User enters check out date "12/28/2020"
And User selects adults per room "1"
And User selects children per room "0"
And User clicks search button
Then User verifies search hotel page navigates to select hotel page

Scenario: Verify user is able to select hotel
When User makes hotel selection
And User clicks continue button
Then User verifies select hotel page navigates to book hotel page

Scenario: Verify user is able to book hotel
When User enters first name "Srinath"
And User enters last name "Ramesh"
And User enters billing address "D-112,Spring Meadows,Wall Street,Munich,Germany"
And User enters card number "8765432112345678"
And User selects card type "VISA"
And User selects expiry month "May"
And User selects expiry year "2022"
And User enters CVV number "689"
And User clicks book now button
Then User verifies book hotel page navigates to booking confirmation page

Scenario: Verify user is able to check booking confirmation
When User clicks My Itenary button
Then User verifies booking confirmation page navigates to booked itenary page

Scenario: Verify user is able to check booked itenary
When User clicks logOut button
Then User verifies successful logout

