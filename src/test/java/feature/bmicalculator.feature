Feature: BMI Calculator
Description: As User, I want BMI calculator functionality under Weight Loss Calculator
Scenario: Validate BMI Calculator functionality
Given I am on Home Page of Calculator.net
And I click on BMI Calculator under Weight Loss Calculators
When I enter Age as "28"
And I select Gender as female
And I enter Height as Feet as "5" and Inches as "11"
And I enter Wieght as "155"
And I click on Calculate button
Then Result should be Normal
And The color of the result should be Green
