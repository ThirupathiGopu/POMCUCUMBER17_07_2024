Feature: OrangeHRM Loginpage

Scenario: VerifyFunctionality of OrangeHRM Login page with valid data

Given lanch chrome browser 
Then Enter url"https://opensource-demo.orangehrmlive.coms"
And  Enter user name "Admin"
Then Enter password"admin123"
And click on login button 
And click on profile button
Then click on Logout button 
And Close broswer 




