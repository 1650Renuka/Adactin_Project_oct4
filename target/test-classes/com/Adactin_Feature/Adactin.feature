Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: Login Page
Given User Launch The Application
When User Enter The "<username>" In Username Field
And User Enter The "<password>" In Password Field
Then User Click On The Login Button And It Navigates To The Search Hotel Page

Examples:

          |username|password|
          |renuka|123|
          |nirisha|654|
          |Renuka1650|Renuka@1650|
          

@sanityTest
Scenario: Search Hotel Page
When User Select The "New York"
And User Select The Hotels
And User Select The Room Type
And User Select The Number of Rooms
And User Select The Adults Per Room
And User Select The Children Per Room
Then User Click On The Search Button And It Navigates To The Select Hotel Page

@sanityTest
Scenario: Select Hotel Page
When User Click On The Select Button
Then User Click On The Continue Button And It Navigates To The Book A Hotel

@sanityTest
Scenario: Book A Hotel And Enter The Details Of User
When User Enter The First Name In First Name Field
And User Enter The Last Name In Last Name Field
And User Enter The Billing Address In Address Field
And USer Enter The Credit Card No In Card No Field
And User Select The Credit Card Type
And User Select Expiry Month
And User Select The Expiry Year
And User Enter The CVV Number In Cvv Number Field
Then User Click On The Book Now Button And It Navigates To The Hotel Booking Confirmation Page

@sanityTest
Scenario: Booking Confirmation Page
Then User Click On The Booked Itinerary Link And It Navigates To The Booked Itinerary Page

@regressionTest
Scenario: Booked Itinerary Page
Then User Click On The Logout Button And It Logouts The Page
     