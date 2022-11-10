Feature: Login with different users

#  @wip
  Scenario Outline: login with student and librarian
    Given user is on login page
    When user login with "<username>" and "<password>"
    Then account holder name should be "<name>"

    @students
    Examples:
      | username          | password | name            |
      | student27@library | oMapQ5NZ | Test Student 27 |
      | student28@library | Dmr6hS9g | Test Student 28 |
      | student29@library | OQki3KSB | Test Student 29 |
      | student30@library | 1HLRfjPS | Test Student 30 |
      | student31@library | M3jrKdwA | Test Student 31 |



    @librarians
    Examples:
      | username            | password | name              |
      | librarian13@library | 6LS0qdmt | Test Librarian 13 |
      | librarian14@library | DqscDBb7 | Test Librarian 14 |
      | librarian15@library | czIccsem | Test Librarian 15 |