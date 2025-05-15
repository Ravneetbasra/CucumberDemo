
Feature: Application Login


Background: 

When launch the browser from config variables
And hit the home page url of banking site
#	// Execution order -->Before -->Background -->Scenario --->After

 @NetBankingTest
  Scenario: Admin Page Login
    Given User is on Landing Page
    When User Login into application with admin and password 1234
    And Home Page is displayed
    And Cards are displayed
    
   #Reusable

  @MobileTest
  Scenario Outline: User Page default login
  
    Given User is on Landing Page
    When User Login into application with <Username> and password "<Password>"
    And Home Page is displayed
    And Cards are displayed
    
    Examples:
    | Username | Password |
    |debituser | hello12  |
    |credituser| lpo213   |
    
    @SmokeTest @RegressionTest @Mortgage
    Scenario: User Page default Sign up
    
    Given User is on Practice Landing Page
    When User Signup into application
    | ravneet |
    | kaur    |
    | contact@gmail.com |
    | 5434364463 |
    Then Home Page is displayed
    And Cards are displayed
    
    

