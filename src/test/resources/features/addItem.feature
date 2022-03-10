Feature: Add item to cart
  user should be able to add item to the shopping cart

  @add_item_to_cart
  Scenario: add item to cart
    Given user is on webpage
    And   enters valid username and password
    And   clicks on login button
    And   adds and item
    And   clicks on cart header link
    Then  verifies that item is added successfully


