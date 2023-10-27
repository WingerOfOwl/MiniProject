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
  
   Background:
Given I am On AltaShop After Login
  @tag1
  Scenario: Buy Product With Rp.0
    When I Click Buy Button Product with Rp.0
    And I Click Cart Icon for Buy Product with Rp.0
    And I Click Bayar Button 1
    Then I verify Buy Product with Rp.0
    
    @tag2
  Scenario: Buy Product With Different 5 Thing
    When I Click Buy Button Product with 5 Different thing
    And I Click Cart Icon for Buy Product with 5 Different thing
    And I Click Bayar Button 2
    Then I verify Buy Product with 5 Different thing
    
    @tag3
  Scenario: Buy Product with 3 Different Rp.0
    When I Click Buy Button Product with 3 Different Rp.0
    And I Click Cart Icon for Buy Product with 3 Different Rp.0
    And I Click Bayar Button 3
    Then I verify Buy Product with 3 Different Rp.0
    
    @tag4
  Scenario: Buy Product with 10 Quantity
    When I Click Buy Button Product with 10 Quantity
    And I Click Cart Icon for Buy Product with 10 Quantity
    And I Click Bayar Button 4
    Then I verify Buy Product with 10 Quantity
    
    @tag5
  Scenario: Buy Product with Correct Condition
    When I Click Buy Button Product with Correct Condition
    And I Click Cart Icon for Buy Product with Correct Condition
    And I Click Bayar Button 5
    Then I verify Buy Product with Correct Condition
