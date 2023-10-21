Feature: Hello
  As an Admin
  I want to see index API
  So that I can See the Result

  Scenario: Get - As admin I Can see Hello Endpoint with Correct Data
    Given I set GET Hello Endpoint
    When I send GET Hello HTTP request
    Then I receive valid HTTP response code 200

  Scenario: Get - As admin I Can see Response Hello Endpoint with Wrong URL
    Given I set GET Hello Wrong Endpoint
    When I send GET Hello HTTP request2
    Then I receive valid HTTP response code 404

  Scenario: POST - As admin I have be able to to create new user
    Given I set POST Hello Endpoint
    When I send POST Hello Endpoint Request
    Then I receive valid HTTP response code 405

