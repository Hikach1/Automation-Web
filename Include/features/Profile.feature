
@Profile
Feature: Profile
  As a user, I can view and edit my Account Information in SecondHand


 @TC.PRF.001
 Scenario: As a user, I can view my Account Information
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 And User close browser
 
 @TC.PRF.002
 Scenario: As a user, I can edit account profile
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 When User input name
 And User input photo profile
 And User select city
 And User input address
 And User input number handphone
 And User click simpan button
 Then User can complete account profile
 And User close browser
 
 @TC.PRF.003
 Scenario: As a user, I cannot edit the account profile when the Name field is blank
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 When User leaves name field blank
 And User input photo profile
 And User select city
 And User input address
 And User input number handphone
 And User click simpan button
 Then User cant complete account profile
 And User close browser
 
 @TC.PRF.004
 Scenario: As a user, I cant complete account profile when the Kota field not choose
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 When User input name
 And User input photo profile
 And User unselect city
 And User input address
 And User input number handphone
 And User click simpan button
 Then User cant complete account profile
 And User close browser
 
 @TC.PRF.005
 Scenario: As a user, I cant edit account profile when the Alamat field empty
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 When User input name
 And User input photo profile
 And User select city
 And User empty address
 And User input number handphone
 And User click simpan button
 Then User cant complete account profile
 And User close browser
 
 @TC.PRF.006
 Scenario: As a user, I cant edit account profile when the No Handphone field empty
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 When User input name
 And User input photo profile
 And User select city
 And User input address
 And User empty number handphone
 And User click simpan button
 Then User cant complete account profile
 And User close browser
 
 @TC.PRF.007
 Scenario: As a user, I can change Photo Profile
 Given User open browser
 When User has successfully logged in
 Then User click the profile icon
 And User click on the account name
 Then User should be navigated to the Account Information page
 When User input name
 And User change photo profile
 And User select city
 And User input address
 And User input number handphone
 And User click simpan button
 Then User can complete account profile
 And User close browser