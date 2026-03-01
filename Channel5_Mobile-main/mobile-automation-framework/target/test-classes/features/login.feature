Feature: My5 iOS Login

  Scenario: Successful login
    Given User is on login screen
    When User enters valid credentials
    And User taps login
    Then Home screen should be displayed