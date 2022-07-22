Feature: Orangehrm application login feature

  Scenario Outline: Test Login of orangehrm application
    Given Open Orangehrm application in chrome
    When User enters valid "<un>" & valid "<psw>"
    When User click on Login button
    Then User should be able to login

    Examples: 
      | un      | psw       |
      | admin   | admin123  |
      | tester1 | tester123 |
      | admin   | admin123  |
      | tester2 | tester123 |
