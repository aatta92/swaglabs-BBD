Feature: Place order
  user should be able to place an order successfully

  @place_order
  Scenario: Place order
    Given user is on webpage
    And   enters valid username and password
    And   clicks on login button
    And   adds and item
    And   clicks on cart header link
    And   clicks on checkout button
    And   fills out fields with valid data
    And   clicks on continue button
    And   clicks on finish button
    Then  verifies that order has been placed successfully