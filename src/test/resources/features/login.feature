Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Background:
    Given user is on login page

#  @wip
  Scenario: login is student
    When user enters username
    And user enters password
    Then user should be on student dashboard

#@wip
  Scenario: login is librarian
    When user enters username
    And user enters password
    Then user should be on librarian dashboard
#  @wip
  Scenario: login as different roles
    When user enters "Student" username
    And user enters "Student" password
    Then user should be on "Student1111111" dashboard

#  @wip
  Scenario: login as different roles
    When user enters "Librarian" username
    And user enters "Librarian" password
    Then user should be on "Librarian" dashboard