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
Feature: Register
  I want to Register Account
Background:
Given I am On AltaShop As A Guest
When I Click Login Button On AltaShop
And I Click Register Link
  @tag1
  Scenario: Register With Correct Data
    And I Input Correct Name
    And I Input Correct Email
    And I Input Correct Password
    Then I Have to Register
    
    @Tag2
    Scenario Outline: Register With Wrong Condition
    And I Input Wrong some <Name>
    And I Input Wrong an <Email1>
    And I Input Wrong a <password1> On Register
    Then Page Show Alert
    
    Examples: 
    |Name| Email1 | password1 | 
    | " " | Della@gmail.com | Della |
    | Della  | " " | Della |
    | Della | Della@gmail.com | " " |
    | " " | " " | " " |
    
    @Tag3
    Scenario: Verify Altashop Icon On Register
    And I click AltaShop Icon On Register
    Then I Back To Main Menu
    
    @Tag4
    Scenario: Verify Cart Icon On Register
    And I click Cart Icon On Register
    Then I am On Cart Page
    
    
    

    