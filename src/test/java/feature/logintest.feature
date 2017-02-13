Feature: Login 

Scenario: Successful Login with Valid credential
Given User is on Home Page
When User enters username and password
And Clicks on Go Button
Then He can visit the Practice Page
And Message is displayed