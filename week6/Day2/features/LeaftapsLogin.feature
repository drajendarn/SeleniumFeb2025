Feature: User Authentication for Leaftaps Application

Scenario: Successful Login using Valid Credentials

When the user enters the username as
And the user enters the password as
And the user clicks the login button
And the user clicks the crsmfa link
And the user clicks the lead menu
And the user clicks the creat lead menu
And Enter FirstName
And Enter LastName
And Enter CompanyName
And Select profileTitle
And Click Submit
Then verify Lead is created successfully




Scenario: Successful Login using InValid Credentials

When the user enters the username as
And the user enters the password as
And the user clicks the login button