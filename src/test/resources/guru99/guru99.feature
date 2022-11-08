Feature: Test the guru99 App
Background:
Scenario Outline: To test the Login feature with valid and invalid data
@PositiveTesting
Scenario: To test login with multiple data
Given i should open the browser and naviagte to the login page of guru99
When Enter Username "<username>"
And Enter Password "<password>"
And Click on the submitbutton
Examples:
|username|password|
|user|user|
|admin|admin|
#@stands for tags
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
Given i should open the browser and naviagte to the login page of guru99
When Enter Username "<username>"
And Enter Password "<password>"
And Click on the submitbutton
Examples:
|username|password|
|@$siva|@$siva|
