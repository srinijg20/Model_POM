Feature: Automated End to End Tests
  I want to build end to end test

  @Srini
  Scenario: Customer place an order by purchasing an item from search
    Given User is on Home Page
    When he searches for "dress"
    And choose to buy the first item
    And moves to checkout from mini cart
    And enters personal details on checkout page
    And select same delivery address
    And selects payment method as "check" payment
    And places the order
