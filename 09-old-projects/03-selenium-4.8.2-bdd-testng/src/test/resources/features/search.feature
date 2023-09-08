Feature: Duck Duck Go Search

  @search
  Scenario Outline: I want to search on duck-duck-go site
    Given I am on the website duck-duck-go
    And   I enter the "<keyword>" to search
    And   I navigate to videos search
    Then  I should get minimum 2 search results

    Examples:
      | keyword    |
      | java       |
      | webdriver  |
      | docker     |
      | kubernetes |