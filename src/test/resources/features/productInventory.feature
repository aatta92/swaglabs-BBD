Feature: Product inventory load
  As user logg in, a product inventory should load

  @product_inventory_page_loading
  Scenario: Product inventory page loading

    Given user is on webpage
    And   enters valid username and password
    And   clicks on login button
    Then  verify that product inventory page loads successfully

