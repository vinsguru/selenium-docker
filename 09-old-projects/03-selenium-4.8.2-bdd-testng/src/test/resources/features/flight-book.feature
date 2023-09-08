Feature: Flight Book

  @book-flight
  Scenario Outline: I should be able to book tickets for a given flight search
    Given I am on flight book page
    When I go to flight details page
    And I select the passengers as "<noOfPassengers>"
    And I go the find flights page
    Then Flight confirmation page should show the price as "<expectedPrice>"

    Examples:
      | noOfPassengers    |  expectedPrice    |
      | 1                 |   $584 USD        |
      | 2                 |   $1169 USD       |
      | 3                 |   $1753 USD       |
      | 4                 |   $2338 USD       |
