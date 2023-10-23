Feature: Product
  As an Admin
  I want to see index API
  So that I can See the Result

  Scenario: Get - As admin I Can Get All Product Endpoint with Correct Data
    Given I set Get All Product Endpoint
    When I send Get All Product request
    Then I receive valid Get All Product HTTP response code 200

  Scenario: Get - As admin I Can Get All Product Endpoint with Wrong URL
    Given I set Get All Product Endpoint with wrong URL
    When I send Get All Product request2
    Then I receive valid Get All Product HTTP response code 404

  Scenario: Post - As admin I have be able to to Post A Category
    Given I set Post All Product Endpoint
    When I send Post All Product Endpoint Request
    Then I receive valid HTTP Post All Product response code 405

  Scenario: Post - As admin I Can Post a new Product Endpoint with Correct Data
    Given I set Post a new Product Endpoint
    When I send Post a new Product request
    Then I receive valid Post a new Product HTTP response code 200

  Scenario: Post - As admin I Can add Post a new Product Endpoint with Wrong URL
    Given I set Post a new Product Endpoint with wrong URL
    When I send Post a new Product request2
    Then I receive valid Post a new Product HTTP response code 404

  Scenario: Put - As admin I have be able to Put a new Product
    Given I set Put a new Product Endpoint
    When I send Put a new Product Endpoint Request
    Then I receive valid HTTP Put a new Product response code 405

  Scenario: Get - As admin I Can Get Product by ID Endpoint with Correct Data
    Given I set Get Product by ID Endpoint
    When I send Get Product by ID request
    Then I receive valid Get Product by ID HTTP response code 200

  Scenario: Get - As admin I Can Get Product by ID Endpoint with Wrong URL
    Given I set Get Product by ID Endpoint with wrong URL
    When I send Get Product by ID request2
    Then I receive valid Get Product by ID HTTP response code 404

  Scenario: Post - As admin I have be able to to Post Product by ID
    Given I set Post Product by ID Endpoint
    When I send Post Product by ID Endpoint Request
    Then I receive valid HTTP Post Get Product by ID response code 405

  Scenario: Delete - As admin I Can see Delete Product Endpoint with Correct Data
    Given I set Delete Product Endpoint
    When I send Delete Product request
    Then I receive valid Delete Product HTTP response code 200

  Scenario: Delete - As admin I Can see Delete Product Endpoint with Wrong URL
    Given I set Delete Product Endpoint with wrong URL
    When I send Delete Product request2
    Then I receive valid Delete Product HTTP response code 404

  Scenario: Post - As admin I have be able to Delete Product
    Given I set Post Product Endpoint
    When I send Post Product Endpoint Request
    Then I receive valid HTTP Post Product response code 405

  Scenario: Post - As admin I Can Assign Product Endpoint with Correct Data
    Given I set Post Assign Product Endpoint
    When I send Post Assign Product request
    Then I receive valid Post Assign Product HTTP response code 200

  Scenario: Post - As admin I Can Post a new Product Endpoint with Wrong URL
    Given I set Post Assign Product Endpoint with wrong URL
    When I send Post Assign Product request2
    Then I receive valid Post Assign Product HTTP response code 404

  Scenario: Put - As admin I have be able to to Put a new Product
    Given I set Put Assign Product Endpoint
    When I send Put Assign Product Endpoint Request
    Then I receive valid HTTP Put Assign Product response code 405

  Scenario: Get - As admin I Can Get Product Rating Endpoint with Correct Data
    Given I set Get Product Rating Endpoint
    When I send Get Product Rating request
    Then I receive valid Get Product Rating HTTP response code 200

  Scenario: Get - As admin I Can Post a new Product Endpoint with Wrong URL
    Given I set Get Product Rating Endpoint with wrong URL
    When I send Get Product Rating request2
    Then I receive valid Get Product Rating HTTP response code 404

  Scenario: Put - As admin I have be able to to Put Product Rating
    Given I set Put Product Rating Endpoint
    When I send Put Product Rating Endpoint Request
    Then I receive valid HTTP Put Product Rating response code 405

  Scenario: Post - As admin I Can Comment Endpoint with Correct Data
    Given I set Post Comment Endpoint
    When I send Post Comment request
    Then I receive valid Post Comment HTTP response code 200

  Scenario: Post - As admin I Can Post a new Comment Endpoint with Wrong URL
    Given I set Post Comment Endpoint with wrong URL
    When I send Post Comment request2
    Then I receive valid Post Comment HTTP response code 404

  Scenario: Put - As admin I have be able to to Put a new Comment
    Given I set Put Comment Endpoint
    When I send Put Comment Endpoint Request
    Then I receive valid HTTP Put Comment response code 405

  Scenario: Get - As admin I Can Get Product Comment Endpoint with Correct Data
    Given I set Get Product Comment Endpoint
    When I send Get Product Comment request
    Then I receive valid Get Comment Rating HTTP response code 200

  Scenario: Get - As admin I Can Post a new Product comment Endpoint with Wrong URL
    Given I set Get Product Comment Endpoint with wrong URL
    When I send Get Product Comment request2
    Then I receive valid Get Comment Rating HTTP response code 404

  Scenario: Put - As admin I have be able to to Put Product Comment
    Given I set Put Product Comment Endpoint
    When I send Put Product Comment Endpoint Request
    Then I receive valid HTTP Put Product Comment response code 405
