Feature: Verifying the Login Feature of the Rediff application

	Background: 
		Given user should be in login page
		
	Scenario: Verify login with valid username and valid password
		When user enter the valid username and the valid password
		And user click on signin button
		Then user should be able to login
		And close the browser
		
	
	Scenario: Verify login with valid username and invalid password

		When user enter valid username and invalid password
		And user click on signin button
		Then user should not be able to login
		And close the browser
	