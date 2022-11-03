Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Scenario: login is student
    Given user is on login page
    When user enters username
    And user enters password
    Then user should be on student dashboard


  Scenario: login is librarian
    Given user is on login page
    When user enters username
    And user enters password
    Then user should be on librarian dashboard