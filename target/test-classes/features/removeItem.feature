Feature: Remove item from cart
  user should be able to remove item from cart successfully

  @remove_item_from_cart
  Scenario: remove item from cart
    Given user is on webpage
    And   enters valid username and password
    And   clicks on login button
    And   adds and item
    And   clicks on cart header link
    And   clicks on remove button
    Then  verifies that item is removed from cart