Feature: Check those buttons

  Scenario: check first button
    Given user is on the button page
    When user click number one button
    Then user should see Clicked on button one!

  Scenario: check second button
    Given user is on the button page
    When user click number two button
    Then user should see Clicked on button two!