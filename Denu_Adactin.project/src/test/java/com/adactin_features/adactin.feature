Feature: Hotel Booking Application


Scenario: Login Page
Given  user Launch The  Url
When  user Enter The User Field Gives The "Dinesh1998"
And user Enters The Password In The "Denu@3198"
Then user Clicks The Loginbtn and Navigates To Hotel Search Page

Scenario: Search Hotel
When user Enter The Location Field and Dropdown The Location
And user Enter The Hotels Field and Dropdown The Hotel and Select
And user Enter The Room Type Field and Select The Room Type
And user Enter The Number of Rooms and Dropdown and Select the No of Room
And user Enter The Check In Date and Gives the In Date
And user Enter The Check Out Date and Gives The Out Date
And user Enter The Adults Per Room Field and Dropdown and Select The No Of Adults
And user Enter The Children Per Room Field and Dropdown and Select The No of Children
Then user Click The Searchbtn and Navigates To Search Hotel1 Page

Scenario: Search Hotel1
When user Enter Selection Box and Select One Of The Hotel and Click
Then user Click The Coninuebtn and Navigates To Book A Hotel Page

Scenario: Book A Hotel
When user Enter The First Name Field and Feed The First Name
And user Enter The Last Name Field and Feed The Last Name
And user Enter The Address Field and Gives The Address
And user Enter The Credit Card No Field and Gives the 16 Digit Card No
And user Enter The Credit Card Type Field and Dropdown and Select The Card Type
And user Enter The Expiry Month Field and Dropdown and Select The Month
And user Enter The Expiry Year Field and Dropdown and Select The Year
And user Enter The Cvv Nos Field and Gives The Cvv Nos
Then user Click On The Book Now and Navigates To The Booking Confirmation

Scenario: Booking Confirmation
Then user Click On The My Itinerybtn and Navigates To The Booked Itenary Page

Scenario: Booked Itinery

When user Enter The Option and Select All The Order Id Option
And user Click On The Cancel Selected and Navigates To the Alert Page
And user click On The Alert Box and Error Will Gone
And user Take The Screen Shot Of The page
And user Click on LogOut
And user Click On The Main page Login Option Again 
Then user Takes The Output Of The Case