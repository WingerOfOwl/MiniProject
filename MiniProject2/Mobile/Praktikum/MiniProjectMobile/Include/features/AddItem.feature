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
Feature: Add Item
  I want to Add Item on Your Groceries App
  
  Background:
  Given I am On On Your Groceries
  When I Click Icon for Navigate to Add Item

  @tag1
  Scenario: Add Item With Correct Data
    And I Add an Correct Data
    And I click Add Item Button 1
    Then I verify Add Item With Correct Data
    
    @tag2
  Scenario: Add Item with Alphabet On Quantity
    And I Add with Alphabet On Quantity
    And I click Add Item Button 2
    Then I verify Add Item with Alphabet On Quantity
    
     @tag3
  Scenario: Add Item with Empty Field
    And I Add with Empty Field
    And I click Add Item Button 3
    Then I verify Add Item with Empty Field
    
    @tag4
  Scenario: Add Item with Empty Name Field
    And I Add with Empty Name Field
    And I click Add Item Button 4
    Then I verify Add Item with Empty Name Field
    
    @tag5
  Scenario: Add Item with Empty Quantity Field
    And I Add with Empty Quantity Field
    And I click Add Item Button 5
    Then I verify Add Item with Empty Quantity Field
    
     @tag6
  Scenario: Add Item with More than 50 Character on Name
    And I Add with More than 50 Character on Name
    Then I verify Add Item with More than 50 Character on Name
    
    @tag7
  Scenario: Add Item with Spesial Character on Quantity
    And I Add with Spesial Character on Quantity
    And I click Add Item Button 7
    Then I verify Add Item with Spesial Character on Quantity
    
     @tag8
  Scenario: Verify Back Arrow Button
    And I Addss Empty Field
    And I click Back Arrow Button
    Then I verify Back Arrow Button
    
  
    
  