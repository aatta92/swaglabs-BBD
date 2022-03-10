Feature: Login
  user should be able to login successfully with entering valid username and password.

  @login_with_valid_credential
  Scenario: Login with valid credential
    Given user is on webpage
    And   enters valid username and password
    And   clicks on login button
    Then  verifies that you logged in successfully

