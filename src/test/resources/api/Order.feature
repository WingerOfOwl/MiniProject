Feature: Order
  As an Admin
  I want to see Order API
  So that I can See the Result of Order API

  Scenario: Post - As admin I Can see New Order Endpoint with Correct Data
    Given I set POST New Order Endpoint
    When I send POST New Order HTTP request
    Then I receive POST New Order valid HTTP response code 200

  Scenario: Post - As admin I Can see Response New Order Endpoint with Wrong URL
    Given I set POST New Order Wrong Endpoint
    When I send POST New Order HTTP request2
    Then I receive POST New Order valid HTTP response code 404

  Scenario: Put - As admin I have be able to change new order
    Given I set Put New Order Endpoint
    When I send Put New Order Endpoint Request
    Then I receive New Order valid HTTP response code 405

  Scenario: Get - As admin I Can Get All Order Endpoint with Correct Data
    Given I set Get All Order Endpoint
    When I send Get All Order HTTP request
    Then I receive Get All Order valid HTTP response code 200

  Scenario: Get - As admin I Can see Response Get All Order Endpoint with Wrong URL
    Given I set Get All Order Wrong Endpoint
    When I send Get All Order HTTP request2
    Then I receive Get All Order valid HTTP response code 404

  Scenario: Post - As admin I have be able to Post Get All Order
    Given I set Post Get All Order Endpoint
    When I send Post Get All Order Endpoint Request
    Then I receive Get All Order valid HTTP response code 405

  Scenario: Get - As admin I Can Get Order By ID Endpoint with Correct Data
    Given I set Get Order By ID Endpoint
    When I send Get Order By ID HTTP request
    Then I receive Get Order By ID valid HTTP response code 404

  Scenario: Get - As admin I Can see Response Get Order By ID Endpoint with Wrong URL
    Given I set Get Order By ID Wrong Endpoint
    When I send Get Order By ID HTTP request2
    Then I receive Get Order By ID valid HTTP response code 400

  Scenario: Put - As admin I have be able to Put Get Order By ID
    Given I set Put Get Order By ID Endpoint
    When I send Put Get Order By ID Endpoint Request
    Then I receive Get Order By ID valid HTTP response code 405