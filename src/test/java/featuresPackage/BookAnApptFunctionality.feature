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
@BookAnAppointment @Smoke @Regression
Feature: Book An Appointment Form and Link Functionality 
  As a user I should be able to Book An Appointment successfully.

  @BookAnAppointment @EndToEnd @Regression
  Scenario: Happy Flow test for Book An Appointment Function
    Given user is in homepage
    And user click Book An Appointment link
    And Book An Appointment fillable form should display
    And user type in first name and last name
    And user type in email address in Your Email section
    And user type in phone number in Your Phone section
    And user type in Date on this format mm/dd/yyyy
    And user able to type chosen time
    And Interested In? Section User should be able to click courses option
    When user type in characters in Message Box
    Then user click Send A Request button
  
  @BookAnAppointment @Smoke @Regression  
  Scenario: Negative test for Book An Appointment Function
    Given user is in homepage
    When user did not click Book An Appointment
    Then Book An Appointment fillable form should NOT display 
    
    
    

