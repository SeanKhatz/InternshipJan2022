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
@AboutUs @Links @Release1.0
Feature: About Us link and other Functionality to read overview.
  User is in the homepage able to click About Us link and user should be able to read About Us Page.

  @Smoke @Links @AboutUs @Release1.0 @Regression
  Scenario: Happy Flow test for About Us link
    Given user is in the homepage
    When user clicks About Us link
    Then user able to see Who We Are

  @Smoke @Links @AboutUs @OurValues @Release1.0 @Regression
  Scenario: Happy Flow About Us Our Values Section
    Given user is in About Us page
    And user go to Our Values section
    When user able to read Our Trending Courses first
    Then user able see and read the topics Best Learning Academy and Industry Leading Expert

  @Smoke @Links @AboutUs @Release1.0 @Regression
  Scenario: Negative Test About Us Our Values Section Functionality
    Given user is in About Us page
    When user did not go to Our Values section
    Then user will not able to read Our Values section but will be in the same page
