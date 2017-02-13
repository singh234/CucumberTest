Feature: BMR Calculator

Scenario: To varify functionality of Basal metabolic rate calculator

Given I am on home page of Calculator.net
When I navigate to Weight Loss Page
And I click on BMR Calculator
And I provide following details
|age|feet|inches|weight|
|28 |   5|    11|   160|
And I Select Female
And I click on Calculate Button
Then I should see the BMR Index 




Scenario Outline: To varify functionality of Basal metabolic rate calculator

Given I am on home page of Calculator.net
When I navigate to Weight Loss Page
And I click on BMR Calculator
And I provide "<age>" and "<feet>" and "<inches>" and "<weight>" details
And I Select Female
And I click on Calculate Button
Then I should see the BMR Index 

Examples:
|age|feet|inches|weight|
|31 |   5|    11|   160|
|30 |   6|     1|   200|
|40 |   5|    10|   180|

