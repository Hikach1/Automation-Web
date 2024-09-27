
@Login
Feature: Login
  As a user, I can login in SecondHand


 @UserLoginSuccess
 Scenario: As a user, I can login
 Given User is on the homepage
 When User click masuk button
 And User input valid email
 And User input valid password
 And User click masuk login button
 Then User success to login
 When User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 
 