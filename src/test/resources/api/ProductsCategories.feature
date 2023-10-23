Feature: Product Catefory
  As an Admin
  I want to see index API
  So that I can See the Result

  Scenario: Post - As admin I Can Post A Category Endpoint with Correct Data
    Given I set Post A Category Endpoint
    When I send Post A Category request
    Then I receive valid Post A Category HTTP response code 200

  Scenario: Post - As admin I Can Post A Category Endpoint with Wrong URL
    Given I set Post A Category Endpoint with wrong URL
    When I send Post A Category request2
    Then I receive valid Post A Category HTTP response code 404

  Scenario: Put - As admin I have be able to to Put A Category
    Given I set Put A Category Endpoint
    When I send Put A Category Endpoint Request
    Then I receive valid HTTP Put A Category response code 405

  Scenario: Get - As admin I Can Get A Category By ID Endpoint with Correct Data
    Given I set Get Category By ID Endpoint
    When I send Get Category By ID request
    Then I receive valid Get Category By ID HTTP response code 404

  Scenario: Get - As admin I Can Get A Category By ID Endpoint with Wrong URL
    Given I set Get Category By ID Endpoint with wrong URL
    When I send Get Category By ID request2
    Then I receive valid Get Category By ID 2 HTTP response code 404

  Scenario: Post - As admin I have be able to Post Category By ID
    Given I set Post Category By ID Endpoint
    When I send Post Category By ID Endpoint Request
    Then I receive valid HTTP Post Category By ID response code 405

  Scenario: Get - As admin I Can Get All Category By ID Endpoint with Correct Data
    Given I set Get All Category Endpoint
    When I send Get All Category request
    Then I receive valid Get All Category HTTP response code 200

  Scenario: Get - As admin I Can Get All Category By ID Endpoint with Wrong URL
    Given I set Get All Category Endpoint with wrong URL
    When I send Get All Category By ID request2
    Then I receive valid Get All Category By ID 2 HTTP response code 404

  Scenario: Post - As admin I have be able to to Post All Category
    Given I set Post All Category Endpoint
    When I send Post All Category Endpoint Request
    Then I receive valid HTTP Post All Category response code 405

  Scenario: Delete - As admin I Can Delete A Category Endpoint with Correct Data
    Given I set Delete A Category Endpoint
    When I send Delete A Category request
    Then I receive valid Delete A Category HTTP response code 200

  Scenario: Delete - As admin I Can Delete A Category Endpoint with Wrong URL
    Given I set Delete A Category Endpoint with wrong URL
    When I send Delete A Category By ID request2
    Then I receive valid Delete A Category By ID 2 HTTP response code 404

  Scenario: Put - As admin I have be able to to Change A Category
    Given I set Put A Category Endpoint 2
    When I send Put A Category Endpoint Request 2
    Then I receive valid HTTP Put A Category 2 response code 405