Feature: Authentication
  As an Admin
  I want to see Authentication API
  So that I can See the Result of Authentication API

  Scenario: Post - As admin I Can add new data Register Endpoint with Correct Data
    Given I set POST Register Endpoint
    When I send POST Register HTTP request
    Then I receive POST Register valid HTTP response code 200

  Scenario: Post - As admin I Can see Response New Register Endpoint with Wrong URL
    Given I set POST Register Wrong Endpoint
    When I send POST Register HTTP request2
    Then I receive POST Register valid HTTP response code 404

  Scenario: Get - As admin I Can see new data Register Endpoint with Correct Data
    Given I set Get Register Endpoint
    When I send Get Register Endpoint Request
    Then I receive Register valid HTTP response code 405

  Scenario: Post - As admin I Can add new data Login Endpoint with Correct Data
    Given I set POST Login Endpoint
    When I send POST Login HTTP request
    Then I receive POST Login valid HTTP response code 200

  Scenario: Post - As admin I Can see Response LoginEndpoint with Wrong URL
    Given I set POST Login Wrong Endpoint
    When I send POST Login HTTP request2
    Then I receive POST Login valid HTTP response code 404

  Scenario: Get - As admin I Can see new data Login Endpoint with Correct Data
    Given I set Get Login Endpoint
    When I send Get Login Endpoint Request
    Then I receive Login valid HTTP response code 405

  Scenario: Get - As admin I Can see new data User Information Endpoint with Correct Data
    Given I set Get User Information Endpoint with correct data
    When I send Get User Information Endpoint Request
    Then I receive User Information valid HTTP response code 200

  Scenario: Get - As admin I Can see new data User Information Endpoint with Wrong URL
    Given I set Get User Information Endpoint with wrong data
    When I send Get User Information Endpoint Request2
    Then I receive User Information valid HTTP response code 404

  Scenario: Post - As admin I Can see Response User Information Endpoint 
    Given I set POST User Information Wrong Endpoint
    When I send POST User Information HTTP request2
    Then I receive POST User Information valid HTTP response code 405