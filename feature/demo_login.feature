#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Demo_Web_login
 
  @login1
  Scenario: Successful login
  
  Given User is on DemoWebShop
  And   User clicks on login button
  When  User enters valid credentials
  And   Click on Login button
  Then  User will be directed to homepage
 
  @Search
  Scenario: Searching products
  
  Given Again user is on DEMOWEBSHOP
  And Enter product name
  When Clicks on search button
  Then Products will appear
  
  @login2
  Scenario Outline: Successful Login multiple times
  
  Given User is on demopage
  And Again clicks on login button
  When user enter "<Email>" and "<Password>" 
  And Again click on Login Button
  Then user will again directed to homepage
   
  
  Examples:
  |Email|Password|
  |karthik456@gmail.com|karthik456|
  |karthik456@gmail.com|karthik456|
  
