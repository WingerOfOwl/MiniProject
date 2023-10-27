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
Feature: See Detail Transaction
  I want to use this template for my feature file
  
Background:
Given I am On AltaShop for Verify See Detail Transaction
    When I Click Transaction Button

  @tag1
  Scenario:
    Then I verify Transaction Page
    
   @Tag2
   Scenario:
   And I Click Row Filter for 5 Rows
   Then I Verify the rows for 5 Rows
   
   @Tag3
   Scenario:
   And I Click Row Filter for 10 Rows
   Then I Verify the rows for 10 Rows
   @Tag4
   Scenario:
  	And I Click Row Filter for 15 Rows
   Then I Verify the rows for 15 Rows
   @Tag5
   Scenario:
   And I Click Row Filter for All Rows
   Then I Verify the rows for All Rows
 
  
   

   