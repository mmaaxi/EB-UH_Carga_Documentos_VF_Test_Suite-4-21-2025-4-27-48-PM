Feature: Validate code injection and security in document upload

  Scenario: Attempt to upload a document with malicious code
    Given the user is on the document upload page
    When the user tries to upload a document named "<script>alert('Hacked!');</script>" or with malicious content
    Then the system should validate and filter the input to prevent injection attacks
    And the security log should record the event
    And an alert should be generated for review