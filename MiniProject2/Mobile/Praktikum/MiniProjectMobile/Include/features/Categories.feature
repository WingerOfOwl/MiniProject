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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
 Scenario Outline: Verify All Category
 Given I am On On Your Groceries 2
  When I Click Icon for Navigate to Add Item 2
    And I Input <category>
    And I Click Add Item Button 8
    Then I Add Item Verify Vegatables Category
    
    Examples:
    |category|
    |Vegetables Categories|
    |Fruit Category|
    |Meat Category|
    |Dairy Category|
    |Carbs Category|
    |Sweets Category|
    |Spices Category|
    |Convenience Category|
    |Hygiene Category|
    |Other Category|