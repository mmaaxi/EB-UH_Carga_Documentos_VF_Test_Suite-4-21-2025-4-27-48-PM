Feature: Password Recovery

  Scenario: Validate password recovery functionality
    Given User is on the login page
    When User clicks on the 'Forgot Password' link
    Then User is redirected to the password recovery page
    When User enters a valid email
    Then The system accepts the input
    When User clicks on the 'Submit' button
    Then A confirmation message is displayed and a recovery link is sent