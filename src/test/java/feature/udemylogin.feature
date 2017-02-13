Feature: Login

Scenario: To validate successful login with correct credential

Given I am on Udemy hompage
And I click on login
When I enter following details
 |userName           |passWord|
 |singh.234@gmail.com|askusi11|
And I click on login button
Then I should find My Courses Link 



Scenario: To validate unsuccessful login with correct credential

Given I am on Udemy hompage
And I click on login
When I enter following details
 |userName           |passWord|
 |singh.234@gmail.com|askusi11|
And I click on login button
Then I should find My Courses Link not appearing