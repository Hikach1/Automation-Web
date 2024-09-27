
@ProductOffer
Feature: Product Offer
  As a user, I can product offer in SecondHand


 @TC.PO.001
 Scenario: Click Product without Logging In
 Given User open browser
 When User input search product
 And User click product
 Then User should be navigated to the product page
 And User close browser
 
 @TC.PO.002
 Scenario: Click Product as a Logged-in user
 Given User open browser
 When User has successfully login
 And User input search product
 And User click product
 Then User should be navigated to the product page
 And User close browser
 
 @TC.PO.003
 Scenario: Clicking the Saya tertarik dan ingin nego button without Logging In
 Given User open browser
 When User input search product
 And User click product
 Then User should be navigated to the product page
 When User click negotiate button
 Then User should be navigated to the product popup page
 And User close browser
 
 @TC.PO.004
 Scenario: Clicking the Saya tertarik dan ingin nego button as a Logged in user
 Given User open browser
 When User has successfully login
 And User input search product
 And User click product
 Then User should be navigated to the product page
 When User click negotiate button
 Then User should be navigated to the product popup page
 And User close browser
 
 @TC.PO.005
 Scenario: Sending a Negotiation Request via the Saya tertarik dan ingin nego button without Logging In
 Given User open browser
 When User input search product
 And User click product
 Then User should be navigated to the product page
 When User click negotiate button
 Then User should be navigated to the product popup page
 When User input negotiate price
 And User click send button
 Then User should be navigated to the login page
 And User close browser
 
 @TC.PO.006
 Scenario: Sending a Negotiation Request via the Saya tertarik dan ingin nego button as a Logged in user
 Given User open browser
 When User has successfully login
 And User input search product
 And User click product
 Then User should be navigated to the product page
 When User click negotiate button
 Then User should be navigated to the product popup page
 When User input negotiate price
 And User click send button
 Then User close browser
 
 @TC.PO.007
 Scenario: Submitting a Negotiation Request with a Price of zero
 Given User open browser
 When User has successfully login
 And User input search product
 And User click product
 Then User should be navigated to the product page
 When User click negotiate button
 Then User should be navigated to the product popup page
 When User input negotiate zero price
 And User click send button
 Then User close browser
 
 
 