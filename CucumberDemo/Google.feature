Feature: Google search validation

  Scenario: Test google search with valid keyword
    Given Open google applictaion
    When User enter valid keyword in search box and go for search
    Then Application should display valid result

    Scenario: Test google search with invalid keyword
    Given OPen Google Application
    When User enter invalid keyword and go for search
    Then Application should display some suggesstions for invalid data