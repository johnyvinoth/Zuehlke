Feature: Login

@SuccessfulLogin @AllTests
Scenario: Sucessful Login with Valid Credentials
	Given user Launch Chrome browser
	When User opens URL 
	And user clicks SignIn link
	And User enters Email as "johnyvinoth@gmail.com" and Password as "ferrari"
	And Click on Login
	Then Page Title should be "My account - My Store"
	And Success message should display "Welcome to your account. Here you can manage all of your personal information and orders."
	When User click on Sign out link
	And Page Title should be "Login - My Store"
	Then close browser
	
@FailLogin @AllTests
Scenario: UnSucessful Login with InValid Credentials
	Given user Launch Chrome browser
	When User opens URL 
	And user clicks SignIn link
	And User enters Email as "johny@gmail.com" and Password as "test"
	And Click on Login
	Then Error message should display "Invalid password."
	Then Page Title should be "Login - My Store"
	Then close browser
	