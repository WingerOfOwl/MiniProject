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
Feature: Login
  I want to Login On AltaShop

  @tag1
  Scenario Outline: Login
    Given I am on Login Page
    When I Input <email> in Login Feature
    And I add <password>
    And I click Login Button
    Then I Have To Login

    Examples: 
      | email  | password | 
      | jiddan@gmail.com |     jiddan |
      | Della1344@gmail.com |     Della12213 |