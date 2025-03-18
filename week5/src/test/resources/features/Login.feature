Feature: Leaftab login functionality
Scenario: Login with positive credentials 

	Given open the chrome browser and Load the URL	
	When User enters username as demosalesmanager 
	And User enters password as crmsa 
	And user clicks on the Login button 
	Then Login should be successful
	And user should see welcome page
	And close the browser
	
	Scenario: Login with incorrect credentials 

	Given open the chrome browser and Load the URL	
	When User enters username as testuser 
	And User enters password as testpass 
	And user clicks on the Login button 
	But user should see Error message
	And close the browser