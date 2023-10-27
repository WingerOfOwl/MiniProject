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
Feature: see Detail Product 2
  I want to see Detail Product
  
  Background:
Given I am On AltaShop for Verify See Detail Transaction 2
    When I Click Transaction Button 2

  @Tag6
  Scenario:
   And I Click Filter Product Button
   Then I Verify the rows for Product
   
   @Tag7
  Scenario:
   And I Click Filter Harga Button
   Then I Verify the rows for Harga
   
   @Tag8
  Scenario:
   And I Click Filter Banyaknya Button
   Then I Verify the rows for Banyaknya
   
   @Tag9
  Scenario:
   And I Click Filter SubTotal Button
   Then I Verify the rows for Subtotal
   
   @Tag10
  Scenario:
   And I Click Previous Button
   Then I Verify Previous Button
   
   @Tag11
  Scenario:
   And I Click Next Button
   Then I Verify Change Next Row