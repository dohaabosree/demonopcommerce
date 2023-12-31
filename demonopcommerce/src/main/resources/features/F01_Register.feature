@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully

  Given user go to register page
  When user select gender type
  And user enter first name "automation"
  And last name "tester"
  And user enter date of birth
  And user enter email "test02@example.com" field
  And user fills Password fields "P@ssw0rd"
  And user fills ConfirmPassword fields "P@ssw0rd"
  And user clicks on register button
  Then user should see a success message

